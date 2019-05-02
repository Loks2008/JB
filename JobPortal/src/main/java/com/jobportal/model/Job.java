package com.jobportal.model;

/*import javax.xml.bind.annotation.XmlRootElement;
*/

public class Job 
{
	private int id;
	
	

	private String name;
	
	private String email;
	
	private String password;
	
	private String mobileno;
	
	private int totalworkexperience;
	
	private String uploadresume;
	
	private String highestqualification;
	
	private String currentdesignation;
	
	private String currentcompany;
	
	private String annualsalary;
	
	private int worksince;
	
	private String currentlocation;
	
	private String noticeperiod;
	
	private String skills;
	
	private String designation;
	
	private String company;
	
	private String duration;
	
	private String highestqualifications;
	
	private String course;
	
	private String specialization;
	
	private String institutename;
	
	private String coursetype;
	
	private String passingyear;
	
	private String areasofexpertise;
	
				
	public int getId() 
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
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

	public int getTotalworkexperience() {
		return totalworkexperience;
	}

	public void setTotalworkexperience(int totalworkexperience) {
		this.totalworkexperience = totalworkexperience;
	}

	public String getUploadresume() {
		return uploadresume;
	}

	public void setUploadresume(String uploadresume) {
		this.uploadresume = uploadresume;
	}

	public String getHighestqualification() {
		return highestqualification;
	}

	public void setHighestqualification(String highestqualification) {
		this.highestqualification = highestqualification;
	}

	public String getCurrentdesignation() {
		return currentdesignation;
	}

	public void setCurrentdesignation(String currentdesignation) {
		this.currentdesignation = currentdesignation;
	}

	public String getCurrentcompany() {
		return currentcompany;
	}

	public void setCurrentcompany(String currentcompany) {
		this.currentcompany = currentcompany;
	}

	public String getAnnualsalary() {
		return annualsalary;
	}

	public void setAnnualsalary(String annualsalary) {
		this.annualsalary = annualsalary;
	}

	public int getWorksince() {
		return worksince;
	}

	public void setWorksince(int worksince) {
		this.worksince = worksince;
	}

	public String getCurrentlocation() {
		return currentlocation;
	}

	public void setCurrentlocation(String currentlocation) {
		this.currentlocation = currentlocation;
	}

	public String getNoticeperiod() {
		return noticeperiod;
	}

	public void setNoticeperiod(String noticeperiod) {
		this.noticeperiod = noticeperiod;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getHighestqualifications() {
		return highestqualifications;
	}

	public void setHighestqualifications(String highestqualifications) {
		this.highestqualifications = highestqualifications;
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

	public String getInstitutename() {
		return institutename;
	}

	public void setInstitutename(String institutename) {
		this.institutename = institutename;
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

	public String getAreasofexpertise() {
		return areasofexpertise;
	}

	public void setAreasofexpertise(String areasofexpertise) {
		this.areasofexpertise = areasofexpertise;
	}

		public Job()
	{
		
	}

	/*public Employee(int i, String n)
	{
		this.id = i;
		this.name = n;
	}*/
	
	@Override
	public String toString()
	{
		return name + "," + name;
	}
	
}
