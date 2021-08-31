package kr.hs.study.beans;

public class CarUser {
	private String owner;
	private String color;
	Car car_type;
	
	public CarUser() {
		
	}
	
	public CarUser(String owner, String color, Car car_type) {
		this.owner = owner;
		this.color = color;
		this.car_type = car_type;
	}
	
	public void prData() {
		System.out.println(this.owner +  " " + this.color + " "+ this.car_type.getPrice() + " " + this.car_type.getName());
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Car getCar_type() {
		return car_type;
	}

	public void setCar_type(Car car_type) {
		this.car_type = car_type;
	}
	
	
}
