package model.vo;

import java.util.List;

public class User {

	private Integer code;
	private String name;
	private String surname;
	private String username;
	private String password;
	private List<Role> roles;

	public User(Integer code, String name, String surname, String username, String password, List<Role> roles) {
		super();
		this.code = code;
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.password = username;
		this.roles = roles;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
