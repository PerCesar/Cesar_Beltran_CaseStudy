package com.beltran.catch22.entity;

import java.util.List; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ParkOrganizer")
public class ParkOrganizer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="parkOrganizerNumber", nullable=false)
	private int parkOrganizerNumber;
	
	@Column(name="lastName", nullable=false)
	private int lastName;
	
	@Column(name="firstName", nullable=false)
	private int firstName;
	
	@Column(name="email", nullable=false)
	private int email;
	
	@Column(name="phoneNumber", nullable=false)
	private int phoneNumber;
	
	@Column(name="parkCode", nullable=false)
	private int parkCode;
	
	@OneToMany(targetEntity = ParticipantsData.class, mappedBy = "parkOrganizerNumber")
	private List participantsdatalist;
	
	@OneToOne(targetEntity = Park.class)
	private List parklist;
	
	public ParkOrganizer() {
		super();
	}

	public ParkOrganizer(int parkOrganizerNumber, int lastName, int firstName, int email, int phoneNumber, int parkCode,
			List<ParticipantsData> documents) {
		super();
		this.parkOrganizerNumber = parkOrganizerNumber;
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.parkCode = parkCode;
	}

	public int getParkOrganizerNumber() {
		return parkOrganizerNumber;
	}

	public void setParkOrganizerNumber(int parkOrganizerNumber) {
		this.parkOrganizerNumber = parkOrganizerNumber;
	}

	public int getLastName() {
		return lastName;
	}

	public void setLastName(int lastName) {
		this.lastName = lastName;
	}

	public int getFirstName() {
		return firstName;
	}

	public void setFirstName(int firstName) {
		this.firstName = firstName;
	}

	public int getEmail() {
		return email;
	}

	public void setEmail(int email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getParkCode() {
		return parkCode;
	}

	public void setParkCode(int parkCode) {
		this.parkCode = parkCode;
	}

	@Override
	public String toString() {
		return "ParkOrganizer [parkOrganizerNumber=" + parkOrganizerNumber + ", lastName=" + lastName + ", firstName="
				+ firstName + ", email=" + email + ", phoneNumber=" + phoneNumber + ", parkCode=" + parkCode
				+ "]";
	}
	
}







