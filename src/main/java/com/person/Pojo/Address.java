package com.person.Pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	@Id
	@GeneratedValue
	@Column(name="address_Id")
	private Long addressId;
	
	@Column(name="address_city")
	private String city;
	
	@Column(name="address_addressType")
	private String addressType;
	
	//@OneToOne(mappedBy="address")
	//private Person person;
	
	
//	public Person getPerson() {
//		return person;
//	}
//	public void setPerson(Person person) {
//		this.person = person;
//	}
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public Address(Long addressId, String city, String addressType, Person person) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.addressType = addressType;
		//this.person = person;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", addressType=" + addressType + "]";
	}
	
	

}
