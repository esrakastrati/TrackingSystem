package com.commonSpace.TrackingSystem;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication; //serverTimezone=UTC

@SpringBootApplication     //dbc:mysql://localhost:3306/sampleDB?&useUnicode=true&
public class TrackingSystemApplication {

	public static void main(String[] args) throws SQLException {
			
//			 String JdbcURL = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
//		      String Username = "root";
//		      String password = "Faelda123";
//		      Connection con = null;
//		      try {
//		         con = DriverManager.getConnection(JdbcURL, Username, password);
//		         System.out.println("Connected to MySQL database");
//		      } catch (Exception e) {
//		         e.printStackTrace();
//		      }
//		      
	
		SpringApplication.run(TrackingSystemApplication.class, args);

	
	}
	



}
		

