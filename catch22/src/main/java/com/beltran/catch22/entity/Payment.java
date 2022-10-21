package com.beltran.catch22.entity;

import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private long number;
	
	@Column(nullable = false)
	private int stateIdNumber;
	
	@Column(nullable = false)
	private String creditCardNumber;
	
	@Column(nullable = false)
	private String expirationDate;
	
	@Column(nullable = false)
	private String securityCode;
	
	@Column(nullable = false)
	private String paymentDate;
	
	@Column(nullable = false)
	private long amount;
	
	@Column(nullable = true)
	private long participantId;
	
	public Payment() {
		super();
	}

	public Payment(long number, int stateIdNumber, String creditCardNumber, String expirationDate,
			String securityCode, String paymentDate, long amount, long participantId) {
		super();
		this.number = number;
		this.stateIdNumber = stateIdNumber;
		this.creditCardNumber = creditCardNumber;
		this.expirationDate = expirationDate;
		this.securityCode = securityCode;
		this.paymentDate = paymentDate;
		this.amount = amount;
		this.participantId = participantId;
	}

	public long getNumber() {
		return number;
	}

	public void setCheckNumber(long number) {
		this.number = number;
	}

	public int getStateIdNumber() {
		return stateIdNumber;
	}

	public void setStateIdNumber(int stateIdNumber) {
		this.stateIdNumber = stateIdNumber;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public long getParticipantId() {
		return participantId;
	}

	public void setParticipantId(long participantId) {
		this.participantId = participantId;
	}

	@Override
	public String toString() {
		return "Payment [number=" + number + ", stateIdNumber=" + stateIdNumber + ", creditCardNumber="
				+ creditCardNumber + ", expirationDate=" + expirationDate + ", securityCode=" + securityCode
				+ ", paymentDate=" + paymentDate + ", amount=" + amount + ", participantId=" + participantId
				+ "]";
	}
	
}












