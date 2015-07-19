package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.vo.Role;
import model.vo.User;

public class RoleDAO extends DAOFactory{
	
	private Connection connection;
	
	public List<Role> findRoles(String username) {

		
		ResultSet result = null;
		try {
			PreparedStatement st = connection.prepareStatement("select * from alumnos");
			result = st.executeQuery();

			if (result.next()) {

				

			}

		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
		}

		return null;
	}
	
}
