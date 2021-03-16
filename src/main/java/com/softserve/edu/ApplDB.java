package com.softserve.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ApplDB {
    
	public static void main(String[] args) throws SQLException {
		String username = System.getenv("THYMELEAF_USER");
		        //"pmp312";
		String password = System.getenv("THYMELEAF_PSW");
		        //"Pmp-312_Pa$$word";
		String url = System.getenv("THYMELEAF_CONNECTION");
		        //"jdbc:mysql://192.168.153.131:3306/thymeleaf";
		//
		System.out.println("url = " + url);
		//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Connection con = DriverManager.getConnection(url, username, password);
		if (con != null) {
			System.out.println("Connection Successful! \n");
		} else {
			System.out.println("Connection ERROR \n");
			System.exit(1);
		}
		Statement st = con.createStatement();
		//
		// Insert/Create data
		//st.execute("INSERT INTO person (city,name) VALUES ('Rivne','Andriy');");
		//st.execute("INSERT INTO person (city,name) VALUES ('Kyiv','Stepan');");
		//
		// Update data
		//st.execute("UPDATE person SET name='Vasja' WHERE pid=5;");
		//st.execute("UPDATE person SET city='Odesa' WHERE name LIKE 'iv%';");
		//
		// Delete data
		//st.execute("DELETE FROM person WHERE name='Vasja';");
		//
		// Read data
		ResultSet rs = st.executeQuery("select * from person;");
		int columnCount = rs.getMetaData().getColumnCount();
		// Resultset.getMetaData () get the information
		for (int i = 1; i <= columnCount; i++) {
			System.out.print(rs.getMetaData().getColumnName(i) + "\t");
		}
		System.out.println();
		// output file
		while (rs.next()) {
			for (int i = 1; i <= columnCount; i++) {
				System.out.print(rs.getString(i) + "\t");
			}
			System.out.println();
		}
		//
		// Close all
		//System.out.println("before close");
		if (rs != null) {
			rs.close();
		}
		if (st != null) {
			st.close();
		}
		if (con != null) {
			con.close();
		}
		System.out.println("DONE");
	}
}
