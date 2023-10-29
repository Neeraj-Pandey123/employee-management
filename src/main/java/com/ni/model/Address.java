package com.ni.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String adr_id;
	private String adr_line1;
	private String adr_line2;
	private String city;
	private String state;
	private String country;
	private Integer zip_code;
	@ManyToOne
	private Employee employee;
	
	public String getAdr_id() {
		return adr_id;
	}
	public void setAdr_id(String adr_id) {
		this.adr_id = adr_id;
	}
	public String getAdr_line1() {
		return adr_line1;
	}
	public void setAdr_line1(String adr_line1) {
		this.adr_line1 = adr_line1;
	}
	public String getAdr_line2() {
		return adr_line2;
	}
	public void setAdr_line2(String adr_line2) {
		this.adr_line2 = adr_line2;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getZip_code() {
		return zip_code;
	}
	public void setZip_code(Integer zip_code) {
		this.zip_code = zip_code;
	}
	public Employee getEmp() {
		return employee;
	}
	public void setEmp(Employee emp) {
		this.employee = emp;
	}
	
	
	
}
