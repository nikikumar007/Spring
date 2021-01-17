package com.training.model;


import java.sql.Array;
import java.time.LocalDate;

public class BloodDonor {
  private String name;
  private int age;
  private String bloodGroup;
  private String gender;
  private long phone;
  private String email;
  private LocalDate dob;
public BloodDonor(String name, int age, String bloodGroup, String gender, long phone, String email, LocalDate dob) {
	super();
	this.name = name;
	this.age = age;
	this.bloodGroup = bloodGroup;
	this.gender = gender;
	this.phone = phone;
	this.email = email;
	this.dob = dob;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getBloodGroup() {
	return bloodGroup;
}
public void setBloodGroup(String bloodGroup) {
	this.bloodGroup = bloodGroup;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
@Override
public String toString() {
	return "BloodDonor [name=" + name + ", age=" + age + ", bloodGroup=" + bloodGroup + ", gender=" + gender
			+ ", phone=" + phone + ", email=" + email + ", dob=" + dob + "]";
}
  
  
}
