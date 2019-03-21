/**
 * Main application
 * Using commandline runner to test sample
 */

package edu.umd.springjdbcdit;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.umd.springjdbcdit.model.Student;
import edu.umd.springjdbcdit.repo.JDBCRepo;
import edu.umd.springjdbcdit.service.StudentService;

@SpringBootApplication
public class JDBCApplication implements CommandLineRunner {
	@Autowired
   DataSource dataSource;
   
	@Autowired
   JDBCRepo jdbcRepo;

   @Autowired
   StudentService serv;

	public static void main(String[] args) {
		SpringApplication.run(JDBCApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Datasource: " + dataSource);

		/* one task: print out students in datastore currently */
		List<Student> students = serv.retrieveForm();//(List<Student>)jdbcRepo.findAll();

		for (Student s : students) {
			System.out.println("Student: " + s.getFirstName());
      }
      
      System.out.println("Done! Writing...");

      // Write to csv in resources
      serv.writeToCSV();
	}
}