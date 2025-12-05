package com.lacrm.api.pojoclass;

import java.util.List;

public class CreateContactPOJO {

	private String fName;
	private String lName;
	private String email;
	private Long phone;
	private String companyName;
	private String JobTitle;
	private List<String> tags;
	private Address address;
	
	public CreateContactPOJO() {
			}

	public CreateContactPOJO(String fName, String lName, String email, Long phone, String companyName,
			String jobTitle, List<String> tags, Address address) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.phone = phone;
		this.companyName = companyName;
		JobTitle = jobTitle;
		this.tags = tags;
		this.address = address;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobTitle() {
		return JobTitle;
	}

	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}


