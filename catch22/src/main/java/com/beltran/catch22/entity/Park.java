package com.beltran.catch22.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "park")
public class Park {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="parkCode", nullable=false)
	private int parkCode;

	@Column(name="parkName", nullable=false)
	private String parkName;
	
	@Column(name="meetingLocation", nullable=false)
	private String meetingLocation;
	
	@Column(name="meetingTime", nullable=false)
	private String meetingTime;
	
	@Column(name="parkOrganizerNumber", nullable=false)
	private String parkOrganizerNumber;
	
	public Park() {
		super();
	}
	public Park(int parkCode, String parkName, String meetingLocation, String meetingTime,
			String parkOrganizerNumber, ParkOrganizer parkOrganizer) {
		super();
		this.parkCode = parkCode;
		this.parkName = parkName;
		this.meetingLocation = meetingLocation;
		this.meetingTime = meetingTime;
		this.parkOrganizerNumber = parkOrganizerNumber;
	}	
	public int getParkCode() {
		return parkCode;
	}
	public void setParkCode(int parkCode) {
		this.parkCode = parkCode;
	}
	public String getParkName() {
		return parkName;
	}
	public void setParkName(String parkName) {
		this.parkName = parkName;
	}
	public String getMeetingLocation() {
		return meetingLocation;
	}
	public void setMeetingLocation(String meetingLocation) {
		this.meetingLocation = meetingLocation;
	}
	public String getMeetingTime() {
		return meetingTime;
	}
	public void setMeetingTime(String meetingTime) {
		this.meetingTime = meetingTime;
	}
	public String getParkOrganizerNumber() {
		return parkOrganizerNumber;
	}
	public void setParkOrganizerNumber(String parkOrganizerNumber) {
		this.parkOrganizerNumber = parkOrganizerNumber;
	}

	@Override
	public String toString() {
		return "Park [parkCode=" + parkCode + ", parkName=" + parkName + ", meetingLocation=" + meetingLocation
				+ ", meetingTime=" + meetingTime + ", parkOrganizerNumber=" + parkOrganizerNumber + "]";
	}
}








