package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAOFactory {

	public static final String DRIVER = "jdbc:sqlite:";
	public static final String DBURL = "app_db.sqlite";

	public static Connection createConnection() {

		Connection connection = null;

		try {

			DriverManager.registerDriver(new org.sqlite.JDBC());

			StringBuilder strConUrl = new StringBuilder();
			strConUrl.append(DRIVER);
			strConUrl.append(DBURL);

			connection = DriverManager.getConnection(strConUrl.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}

		return connection;

	}

}
