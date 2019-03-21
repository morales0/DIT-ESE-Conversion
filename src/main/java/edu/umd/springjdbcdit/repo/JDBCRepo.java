/**
 * Using CRUD default queries
 */

package edu.umd.springjdbcdit.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.umd.springjdbcdit.model.Student;

@Repository
public interface JDBCRepo extends CrudRepository<Student, Long>{
}