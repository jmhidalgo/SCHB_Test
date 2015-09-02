package model.dao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class DAOFactory {

	public static final String DRIVER = "jdbc:sqlite:";
	public static final String DBURL = "C:/Users/jmhidalgob/Desarrollo/Workspace/SCHB_Test/db/app_db.sqlite";

	public static Connection createConnection() {

		Connection connection = null;
		
		try {
			
			DriverManager.registerDriver(new org.sqlite.JDBC());
			
            String dbURL = DRIVER + DBURL;
            connection = DriverManager.getConnection(dbURL);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return connection;

	}

}
