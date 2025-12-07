package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bike{
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String Model;
	private String Color;
	private int Price;
	
	
	public Bike() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getModel() {
		return Model;
	}


	public void setModel(String model) {
		Model = model;
	}


	public String getColor() {
		return Color;
	}


	public void setColor(String color) {
		Color = color;
	}


	public int getPrice() {
		return Price;
	}


	public void setPrice(int price) {
		Price = price;
	}


	@Override
	public String toString() {
		return "Bike [Id=" + Id + ", Model=" + Model + ", Color=" + Color + ", Price=" + Price + "]";
	}


	public Bike(int id, String model, String color, int price) {
		super();
		Id = id;
		Model = model;
		Color = color;
		Price = price;
	}
	
	
}