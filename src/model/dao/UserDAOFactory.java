package model.dao;

import java.sql.*;

public class UserDAOFactory extends DAOFactory{

	public static UserDAO getUserDAO() {
		Connection connection = createConnection();
		return new UserDAO(connection);
	}

}
