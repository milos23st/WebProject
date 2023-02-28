package beans;

import java.util.ArrayList;

public class User {
	
	private int id;
	private String username;
	private String password;
	private String name;
	private String lastName;
	private String dateOfBirth;
	private boolean gender;
	private Role role;
	
	ArrayList<Integer> boughtTrainings;
	ArrayList<Integer> sportsFacilities;
	ArrayList<Integer> visitedSportsFacilities;
	
	private int points;
	
	private int customerType;
	
	//private double monthlyMembership;
	
	ArrayList<Integer> membershipFees;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	
	
	
	

}
