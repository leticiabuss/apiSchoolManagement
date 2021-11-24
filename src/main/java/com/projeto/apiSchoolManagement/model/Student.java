package com.projeto.apiSchoolManagement.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private LocalDateTime birthDate;
	private String phone;
	private String cellPhone;
	private String street;
	private int number;
	private String district;
	private String city;
	private String state;
	private String email;
	private LocalDateTime createStudent;
	private LocalDateTime deleteStudent;
	private LocalDateTime lastUpdate;

	@Enumerated(EnumType.STRING)
	private StatusRegistration statusRegistration = StatusRegistration.CREATED;

	//private User idUser;

	public Student(Long id, String name, LocalDateTime birthDate, String phone, String cellPhone, String street,
			int number,
			String district, String city, String state, String email, LocalDateTime createStudent,
			LocalDateTime deleteStudent, LocalDateTime lastUpdate,
			StatusRegistration statusRegistration) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.phone = phone;
		this.cellPhone = cellPhone;
		this.street = street;
		this.number = number;
		this.district = district;
		this.city = city;
		this.state = state;
		this.email = email;
		this.createStudent = createStudent;
		this.deleteStudent = deleteStudent;
		this.lastUpdate = lastUpdate;
		this.statusRegistration = statusRegistration;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDateTime birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getCreateStudent() {
		return createStudent;
	}

	public void setCreateStudent(LocalDateTime createStudent) {
		this.createStudent = createStudent;
	}

	public LocalDateTime getDeleteStudent() {
		return deleteStudent;
	}

	public void setDeleteStudent(LocalDateTime deleteStudent) {
		this.deleteStudent = deleteStudent;
	}

	public LocalDateTime getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(LocalDateTime lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public StatusRegistration getStatusRegistration() {
		return statusRegistration;
	}

	public void setStatusRegistration(StatusRegistration statusRegistration) {
		this.statusRegistration = statusRegistration;
	}
}
