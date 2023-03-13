package com.project.htproject.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "candidate_address_table")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "AddressId")
	private Long addressId;
	@Column(name = "line1")
	private String addressLine1;
	@Column(name = "line2")
	private String addressLine2;
	@Column(name = "districtId")
	private String district;
	@Column(name = "StateId")
	private String state;
	@Column(name = "countryId")
	private String country;
	@Column(name = "pincode")
	private String pincode;
	

	@ManyToOne
	@JoinColumn(name="candidate_id")
	@JsonBackReference
	private Candidate candidate;

	

	public Address(String addressLine1, String addressLine2, String district, String state, String country,
			String pincode, Candidate candidate) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.district = district;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.candidate = candidate;
	}


	public Address() {
		super();
	}


	public Long getAddressId() {
		return addressId;
	}


	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}


	public String getAddressLine1() {
		return addressLine1;
	}


	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}


	public String getAddressLine2() {
		return addressLine2;
	}


	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	public Candidate getCandidate() {
		return candidate;
	}


	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

//    
//	@Override
//	public String toString() {
//		return "Address [addressId=" + addressId + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2
//				+ ", district=" + district + ", state=" + state + ", country=" + country + ", pincode=" + pincode
//				+ ", candidate=" + candidate + "]";
//	}
//	
	

}

/*
 * candidateId bigint line1 varchar(250) line2 varchar(250) districtId int
 * StateId int countryId int pincode
 */