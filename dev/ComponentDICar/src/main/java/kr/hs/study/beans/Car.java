package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private int price;
	private String name;
	
	
	
	public Car(@Value("3000")int price, @Value("k5")String name) {
		this.price = price;
		this.name = name;
	}



	@Override
	public String toString() {
		return "Car [price=" + price + ", name=" + name + "]";
	}
	
	
}
