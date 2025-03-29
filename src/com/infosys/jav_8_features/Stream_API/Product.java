package com.infosys.jav_8_features.Stream_API;

import java.util.Objects;

public class Product {

	private int id;
	private String name;
	private double price;
	private String color;
	private int rating;

	public Product() {

	}

	public Product(int id, String name, double price, String color, int rating) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.color = color;

		if (rating >= 1 && rating <= 5) {
			this.rating = rating;

		} else {
			System.out.println("rating should be 1 to 5 only");

		}

	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", color=" + color + ", rating=" + rating
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, id, name, price, rating);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(color, other.color) && id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && rating == other.rating;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {

		if (rating >= 1 && rating <= 5) {
			this.rating = rating;

		} else {
			System.out.println("rating should be 1 to 5 only");

		}
	}

//	public boolean getPrice1()
//	{
//		
//		return
//	}
	
	
	
	
}
