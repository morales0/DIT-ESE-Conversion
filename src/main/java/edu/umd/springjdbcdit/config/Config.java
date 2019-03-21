/**
 * DataSource config class
 */

package edu.umd.springjdbcdit.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import oracle.jdbc.pool.OracleDataSource;

@Configuration
@ConfigurationProperties("oracle")
public class Config {
   private String url;
   private String username;
   private String password;

   public void setUrl(String url) {
      this.url = url;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   @Bean
   DataSource dataSource() throws SQLException {
      OracleDataSource ds = new OracleDataSource();

      ds.setUser(username);
      ds.setPassword(password);
      ds.setURL(url);
      ds.setPortNumber(1521);
      ds.setDriverType("thin");

      return ds;
   }
}