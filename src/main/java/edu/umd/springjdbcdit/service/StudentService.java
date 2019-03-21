/**
 * Database interactions
 */
package edu.umd.springjdbcdit.service;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.opencsv.CSVWriter;
import com.opencsv.CSVWriterBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Service;

import edu.umd.springjdbcdit.model.Student;
import edu.umd.springjdbcdit.repo.JDBCRepo;

@Service
public class StudentService {
   @Autowired
   JdbcTemplate jdbc;

   @Autowired
   JDBCRepo jdbcRepo;

   public List<Student> retrieveForm() {
      return jdbc.query("SELECT " + arrayToString(new String[]{"student_id, first_name, last_name"}) + "FROM student",
            (rs, row) -> new Student(rs.getLong("student_id"), rs.getString("first_name"), rs.getString("last_name")));
   }

   /**
    * Write database to a csv file, comma separated, using opencsv library
    */
   public void writeToCSV() {
      CSVWriterBuilder builder = null;
      try {
         builder = new CSVWriterBuilder(new FileWriter("./src/main/resources/students.csv")).withSeparator(',');

         if (builder != null) {
            CSVWriter writer = (CSVWriter) builder.build();

            jdbc.query("SELECT student_id, first_name, last_name FROM student", new RowCallbackHandler() {

               @Override
               public void processRow(ResultSet rs) throws SQLException {
                  try {
                     // Column names
                     String[] ssn = new String[3];
                     for (int i = 1; i <= 3; i++) {
                        ssn[i - 1] = rs.getMetaData().getColumnName(i);
                     }
                     writer.writeNext(ssn, false);

                     // Write data
                     do {
                        String[] ss = new String[3];
                        for (int i = 1; i <= 3; i++) {
                           ss[i - 1] = rs.getString(i);
                        }
                        writer.writeNext(ss, false);
                     } while (rs.next());

                     writer.flush();
                     writer.close();
                  } catch (IOException e) {
                     e.printStackTrace();
                  }
                  
               }
            });
         }

      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   private String arrayToString(String[] a){
      StringBuilder sb = new StringBuilder();

      for(String s  : a){
         sb.append(s + " ");
      }

      return sb.toString();
   }
}