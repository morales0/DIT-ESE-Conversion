/**
 * Database interaction methods for AID Form
 */
package edu.umd.springjdbcdit.service;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.opencsv.CSVWriter;
import com.opencsv.CSVWriterBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import edu.umd.springjdbcdit.model.SFAStudentAwrdReq;
import edu.umd.springjdbcdit.repo.FormRepo;

public class FormService<T> implements IFormService<T> {

   @Autowired
   FormRepo repo;

   @Autowired
   JdbcTemplate jdbc;

   /**
    * Write database to a csv file, comma separated, using opencsv library
    */
   public void writeToCSV() {
      String sql = "SELECT " + arrayToString(SFAStudentAwrdReq.columnNames) + "FROM SFA.SFA_STU_AWRD_REQ";
      CSVWriterBuilder builder = null;

      try {
         builder = new CSVWriterBuilder(new FileWriter("./src/main/resources/students.csv")).withSeparator(',');
      } catch (IOException e) {
         e.printStackTrace();
      }

      if (builder != null) {
         CSVWriter writer = (CSVWriter) builder.build();

         jdbc.query(sql, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
               try {
                  int num_col = rs.getMetaData().getColumnCount();

                  // Write column names as header
                  String[] col_names = new String[num_col];
                  for (int i = 0; i < num_col; i++) {
                     col_names[i] = rs.getMetaData().getColumnName(i + 1);
                  }
                  writer.writeNext(col_names, false);

                  // Write data
                  do {
                     String[] data = new String[num_col];
                     for (int i = 0; i < num_col; i++) {
                        data[i] = rs.getString(i + 1);
                     }
                     writer.writeNext(data, false);
                  } while (rs.next());

                  writer.flush();
                  writer.close();
               } catch (IOException e) {
                  e.printStackTrace();
               }
            }
         });
      }
   }

   @Override
   public RowMapper<SFAStudentAwrdReq> getStuAwrdReqMapper() {
      return new RowMapper<SFAStudentAwrdReq>() {

         @Override
         public SFAStudentAwrdReq mapRow(ResultSet rs, int rowNum) throws SQLException {
            SFAStudentAwrdReq form = new SFAStudentAwrdReq();
            // Enter variables

            return form;
         }
      };
   }

   // Helper
   private String arrayToString(String[] a){
      StringBuilder sb = new StringBuilder();

      for(String s  : a){
         sb.append(s + " ");
      }

      return sb.toString();
   }
}