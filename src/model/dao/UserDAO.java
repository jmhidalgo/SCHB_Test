package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.vo.User;

public class UserDAO {

	private Connection connection;

	public UserDAO(Connection connection) {
		super();
		this.connection = connection;
	}

	public User findUser(String username) {

		User user = null;
		ResultSet result = null;
		try {
			PreparedStatement st = connection.prepareStatement(
					"SELECT CODE, NAME, SURNAME, USERNAME, PASSWORD FROM USERS WHERE USERNAME = '" + username + "'");
			result = st.executeQuery();

			if (result.next()) {

				/*
				 * this.code = code; this.name = name; this.surname = surname;
				 * this.username = username; this.roles = roles;
				 */

				Integer code = result.getInt("code");
				String name = result.getString("name");
				String surname = result.getString("surname");
				String password = result.getString("password");

				user = new User(code, name, surname, username, password, null);

			}

		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
		}

		return null;
	}

}
