package com.training.servlet;

public class User {
private String userName;
private String password;
private String role;
public User() {
	super();
	// TODO Auto-generated constructor stub
}

public User(String userName, String password, String role) {
	super();
	this.userName = userName;
	this.password = password;
	this.role = role;
}

public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void swtPassword(String password) {
	this.password = password;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
@Override
public String toString() {
	return "User [userName=" + userName + ", passWord=" + password + ", role=" + role + "]";
}

}
