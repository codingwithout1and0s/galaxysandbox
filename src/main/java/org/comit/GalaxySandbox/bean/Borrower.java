package org.comit.GalaxySandbox.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity // will create table called Borrower
public class Borrower {
	
	@Id
	@GeneratedValue
	private Long id;
	private String sinNum;
	private String firstName;
	private String lastName;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd") //formats DOB into year, month, date
	private Date dob;
	
	private int pdStatus;
	private String unitNum;
	private String address;
	private String city;
	private String postalZipCode;
	private String provinceState;
	private String country;
	private String primaryPhoneNum;
	private String primaryPhoneType;
	private String secondaryPhoneNum;
	private String secondaryPhoneType;
	private String internationalPhoneNum;
	private String internationalPhoneType;
	private String email;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSinNum() {
		return sinNum;
	}
	public void setSinNum(String sinNum) {
		this.sinNum = sinNum;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getPdStatus() {
		return pdStatus;
	}
	public void setPdStatus(int pdStatus) {
		this.pdStatus = pdStatus;
	}
	public String getUnitNum() {
		return unitNum;
	}
	public void setUnitNum(String unitNum) {
		this.unitNum = unitNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalZipCode() {
		return postalZipCode;
	}
	public void setPostalZipCode(String postalZipCode) {
		this.postalZipCode = postalZipCode;
	}
	public String getProvinceState() {
		return provinceState;
	}
	public void setProvinceState(String provinceState) {
		this.provinceState = provinceState;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPrimaryPhoneNum() {
		return primaryPhoneNum;
	}
	public void setPrimaryPhoneNum(String primaryPhoneNum) {
		this.primaryPhoneNum = primaryPhoneNum;
	}
	public String getPrimaryPhoneType() {
		return primaryPhoneType;
	}
	public void setPrimaryPhoneType(String primaryPhoneType) {
		this.primaryPhoneType = primaryPhoneType;
	}
	public String getSecondaryPhoneNum() {
		return secondaryPhoneNum;
	}
	public void setSecondaryPhoneNum(String secondaryPhoneNum) {
		this.secondaryPhoneNum = secondaryPhoneNum;
	}
	public String getSecondaryPhoneType() {
		return secondaryPhoneType;
	}
	public void setSecondaryPhoneType(String secondaryPhoneType) {
		this.secondaryPhoneType = secondaryPhoneType;
	}
	public String getInternationalPhoneNum() {
		return internationalPhoneNum;
	}
	public void setInternationalPhoneNum(String internationalPhoneNum) {
		this.internationalPhoneNum = internationalPhoneNum;
	}
	public String getInternationalPhoneType() {
		return internationalPhoneType;
	}
	public void setInternationalPhoneType(String internationalPhoneType) {
		this.internationalPhoneType = internationalPhoneType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String fullName() {
		return "Borrower [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	@Override
	public String toString() {
		return "Borrower [unitNum=" + unitNum + ", address=" + address + ", city=" + city + ", postalZipCode="
				+ postalZipCode + ", provinceState=" + provinceState + ", country=" + country + "]";
	}
	
}
