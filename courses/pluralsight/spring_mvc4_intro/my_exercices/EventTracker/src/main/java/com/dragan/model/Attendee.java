package com.dragan.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.dragan.view.Phone;

public class Attendee {
	@Size(min=2, max=30)
	private String name;
	
	@NotEmpty @Email
	private String emailAddress;

	@NotEmpty @Phone
	private String phone;
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	@Override
	public String toString() {
		return "Attendee [name=" + name + ", emailAddress=" + emailAddress + "]";
	}
}
