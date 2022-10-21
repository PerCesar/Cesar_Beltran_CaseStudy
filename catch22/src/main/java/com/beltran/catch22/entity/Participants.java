package com.beltran.catch22.entity;

import java.util.List;
import java.util.Set;

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
@Table(name = "participants")
public class Participants {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private long id;
	
	@Column(nullable = false)
	private String lastName;
	
	@Column(nullable = false)
	private String firstName;
	
	@Column(nullable = false)
	private String phoneNumber;
	
	@Column(nullable = false)
	private String homeAddress;
	
	@Column(nullable = false)
	private String city;
	
	@Column(nullable = false)
	private String state;
	
	@Column(nullable = false)
	private String postalCode;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private long birthYear;
	
	@OneToOne(targetEntity = Payment.class)
	private List paymentlist;
	
	@OneToMany(mappedBy = "id")
	private List<Equipment> equipmentList;
	
	@OneToMany(mappedBy = "id")
	private List<ParticipantsData> participantsDataList;

	
	public Participants() {
		super();
		
	}

	public Participants(long id, String lastName, String firstName, String phoneNumber,
			String homeAddress, String city, String state, String postalCode, String email, long birthYear,
			List<ParticipantsData> participantsdata) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.phoneNumber = phoneNumber;
		this.homeAddress = homeAddress;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.email = email;
		this.birthYear = birthYear;
	}

	public long getId() {
		return id;
	}

	public void setParticipantNumber(long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
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

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(long birthYear) {
		this.birthYear = birthYear;
	}

	@Override
	public String toString() {
		return "Participants [id=" + id + ", lastName=" + lastName + ", firstName="
				+ firstName + ", phoneNumber=" + phoneNumber + ", homeAddress=" + homeAddress + ", city=" + city
				+ ", state=" + state + ", postalCode=" + postalCode + ", email=" + email + ", birthYear=" + birthYear
				+ "]";
	}


	}
