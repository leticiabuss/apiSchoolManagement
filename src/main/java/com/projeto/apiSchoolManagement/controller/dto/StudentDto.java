package com.projeto.apiSchoolManagement.controller.dto;

import java.time.LocalDateTime;

import com.projeto.apiSchoolManagement.model.Student;

public class StudentDto {

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

	public StudentDto(Student student) {
		this.id = student.getId();
		this.name = student.getName();
		this.birthDate = student.getBirthDate();
		this.phone = student.getPhone();
		this.cellPhone = student.getCellPhone();
		this.street = student.getStreet();
		this.number = student.getNumber();
		this.district = student.getDistrict();
		this.city = student.getCity();
		this.state = student.getState();
		this.email = student.getEmail();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDateTime getBirthDate() {
		return birthDate;
	}

	public String getPhone() {
		return phone;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public String getStreet() {
		return street;
	}

	public int getNumber() {
		return number;
	}

	public String getDistrict() {
		return district;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getEmail() {
		return email;
	}
}
