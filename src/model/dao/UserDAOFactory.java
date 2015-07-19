package model.dao;

import java.sql.*;

public class UserDAOFactory extends DAOFactory{

	public UserDAO getUserDAO() {
		Connection connection = createConnection();
		return new UserDAO(connection);
	}

}
