package model.dao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class DAOFactory {

	public static final String DRIVER = "jdbc:sqlite:";
	public static final String DBURL = "app_db.sqlite";

	public static Connection createConnection() {

		Connection connection = null;
		
		try {
			
			DriverManager.registerDriver(new org.sqlite.JDBC());
            String dbURL = DRIVER + DBURL;
            connection = DriverManager.getConnection(dbURL);
            
            if (connection != null) {
                System.out.println("Connected to the database");
                DatabaseMetaData dm = (DatabaseMetaData) connection.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
            }
            

		} catch (Exception e) {
			e.printStackTrace();
		}

		return connection;

	}

}
