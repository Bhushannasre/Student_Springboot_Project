package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="stu")
public class Students {
@javax.persistence.Id
@GeneratedValue(strategy= GenerationType.AUTO)
public int Id;
@Column(name="First_name")
public String firstname;
@Column(name="Last_name")
public String lastname;
@Column(name="Email")
public String email;
public Students(int id, String firstname, String lastname, String email) {
	super();
	Id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
}
public Students() {
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Students [Id=" + Id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
}


}
