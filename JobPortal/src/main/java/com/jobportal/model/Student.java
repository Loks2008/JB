package com.jobportal.model;



public class Student {

	private String name;
	
	private String email;
	
	private String password;
	
	private String mobileno;
	
	private String location;
	
	private String fileupload;
	
	private String qualification;
	
	private String course;
	
	private String specialization;
	
	private String collegename;
	
	private String coursetype;
	
	private String passingyear;
	
	private String skills;

	private Long FileSize;
	
	
	
	public Long getFileSize() {
		return FileSize;
	}

	public void setFileSize(Long fileSize) {
		FileSize = fileSize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFileupload() {
		return fileupload;
	}

	public void setFileupload(String fileupload) {
		this.fileupload = fileupload;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public String getCoursetype() {
		return coursetype;
	}

	public void setCoursetype(String coursetype) {
		this.coursetype = coursetype;
	}

	public String getPassingyear() {
		return passingyear;
	}

	public void setPassingyear(String passingyear) {
		this.passingyear = passingyear;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}
	
	@Override
	public String toString() {
		return skills + "," + name;
	}
	
	
}
