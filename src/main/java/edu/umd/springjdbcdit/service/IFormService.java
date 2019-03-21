/**
 * Interface for Form service class
 */
package edu.umd.springjdbcdit.service;

import org.springframework.jdbc.core.RowMapper;

import edu.umd.springjdbcdit.model.SFAStudentAwrdReq;

public interface IFormService<T>{
   public void writeToCSV();
   public RowMapper<SFAStudentAwrdReq> getStuAwrdReqMapper();
}