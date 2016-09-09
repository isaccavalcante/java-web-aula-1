package br.ufc.rc.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection(){
		
		try {
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/web_rc", "teste", "teste");
			System.out.println("Conectado!");
			return c;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	
}
