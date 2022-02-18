package com.person.Pojo;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="Mname")
	private String Mname;
	
	@Column(name="Fname")
	private String Fname;
	
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="fk_address_id")
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_person_id",referencedColumnName="id")
	private List<Address> address;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMname() {
		return Mname;
	}
	public void setMname(String mname) {
		Mname = mname;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	
	
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public Person(Integer id, String name, String mname, String fname, List<Address> address) {
		super();
		this.id = id;
		this.name = name;
		Mname = mname;
		Fname = fname;
		this.address = address;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", Mname=" + Mname + ", Fname=" + Fname + ", address=" + address
				+ "]";
	}
	

	

}
