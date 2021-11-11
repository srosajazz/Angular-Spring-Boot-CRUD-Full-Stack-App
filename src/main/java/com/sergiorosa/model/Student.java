package com.sergiorosa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studets")
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "rating_number")
	private Integer ratingNumber;
	
	@Column(name = "id_number")
	private int idNumber;
	
	@Column(name = "current_semester")
	private int currentSemester;
	
	public Student() {};
	
	
	public Student(String firstName, String lastName, String emailId, int idNumber, Integer ratingNumber,
			int currentSemester) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.idNumber = idNumber;
		this.ratingNumber = ratingNumber;
		this.currentSemester = currentSemester;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public Integer getRatingNumber() {
		return ratingNumber;
	}
	public void setRatingNumber(Integer ratingNumber) {
		this.ratingNumber = ratingNumber;
	}
	public int getCurrentSemester() {
		return currentSemester;
	}
	public void setCurrentSemester(int currentSemester) {
		this.currentSemester = currentSemester;
	}
}
