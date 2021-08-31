package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestBean5 {
	private int a;
	private double b;
	private DataBean4 data4;
	private DataBean5 data5;
	
	public TestBean5() {
		
	}
	
	public TestBean5(DataBean4 data4, DataBean5 data5) {
		this.data4 = data4;
		this.data5 = data5;
	}
	
	
	
	@Autowired
	public TestBean5(@Value("100")int a, @Value("33.33")double b, DataBean4 data4, DataBean5 data5) {
		this.a = a;
		this.b = b;
		this.data4 = data4;
		this.data5 = data5;
	}


	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public DataBean4 getData4() {
		return data4;
	}
	public void setData4(DataBean4 data4) {
		this.data4 = data4;
	}
	public DataBean5 getData5() {
		return data5;
	}
	public void setData5(DataBean5 data5) {
		this.data5 = data5;
	}
	
	
}
