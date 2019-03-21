/**
 * Using CRUD default queries for querying
 */

package edu.umd.springjdbcdit.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.umd.springjdbcdit.model.Student;

@Repository
public interface FormRepo extends CrudRepository<Student, Long>{
   // Own methods
}