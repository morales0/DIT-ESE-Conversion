/**
 * Student Model
 */

package edu.umd.springjdbcdit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
   @Id
   private Long studentId;

   @Column(nullable = false, name = "first_name")
   private String firstName;

   @Column(nullable = false, name = "last_name")
   private String lastName;

   protected Student() {
      // no args constructor
   }

   public Student(Long studentId, String firstName, String lastName) {
      this.studentId = studentId;
      this.firstName = firstName;
      this.lastName = lastName;
   }

   /**
    * @return the firstName
    */
   public String getFirstName() {
      return firstName;
   }

   /**
    * @param firstName the firstName to set
    */
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   /**
    * @return the lastName
    */
   public String getLastName() {
      return lastName;
   }

   /**
    * @param lastName the lastName to set
    */
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

}