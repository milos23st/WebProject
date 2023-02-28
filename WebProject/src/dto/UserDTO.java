package dto;

import beans.Role;


import beans.User;

public class UserDTO {
	
	private String username;
	private String password;
	private String name;
	private String lastName;
	private boolean gender;
	private Role role;
	private String jwt;
	
public UserDTO (User u, String jwt) {
		
		this.username = u.getUsername();
		this.password = u.getPassword();
		this.name = u.getName();
		this.lastName= u.getLastName();
		this.gender = u.isGender();
		this.role = u.getRole();
		this.jwt = jwt;
	}
	
}
