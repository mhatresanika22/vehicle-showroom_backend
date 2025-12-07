package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TestRide {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String phone;
    private String vehicle;
    private String date;

    // getters & setters
    public TestRide() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "TestRide [id=" + id + ", name=" + name + ", phone=" + phone + ", vehicle=" + vehicle + ", date=" + date
				+ "]";
	}

	public TestRide(int id, String name, String phone, String vehicle, String date) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.vehicle = vehicle;
		this.date = date;
	}
    
}

