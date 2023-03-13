package com.project.htproject.dto;

import com.project.htproject.entity.Candidate;

public class AddressDto {

	private Long addressId;
	private Candidate candidateId;
	private String addressLine1;
	private String addressLine2;
	private String district;
	private String state;
	private String countryId;
	private String pincode;
	
	
	public AddressDto(Candidate candidateId, String addressLine1, String addressLine2, String district, String state,
			String countryId, String pincode) {
		super();
		this.candidateId = candidateId;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.district = district;
		this.state = state;
		this.countryId = countryId;
		this.pincode = pincode;
	}
	
	
	public AddressDto() {
		super();
	}
	
	
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public Candidate getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(Candidate candidateId) {
		this.candidateId = candidateId;
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
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public AddressDto(Long addressId, Candidate candidateId, String addressLine1, String addressLine2, String district,
			String state, String countryId, String pincode) {
		super();
		this.addressId = addressId;
		this.candidateId = candidateId;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.district = district;
		this.state = state;
		this.countryId = countryId;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", candidateId=" + candidateId + ", addressLine1=" + addressLine1
				+ ", addressLine2=" + addressLine2 + ", district=" + district + ", state=" + state + ", countryId="
				+ countryId + ", pincode=" + pincode + "]";
	}
	


}