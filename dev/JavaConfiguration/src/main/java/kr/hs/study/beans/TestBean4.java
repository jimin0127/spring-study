package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;

// Autowired 
// 등록된 빈 중에 같은 타입에 자동으로 삽입
// 1. 멤버변수 위에 (중요)
// 2. Setter 위에 매개변수 타입으로 DataBean4을 넣어라 
//3. 생성자 DataBean4로 등록된 빈을 자동으로 DataBean4에 넣어라 

public class TestBean4 {
	private int data1;
	
	@Autowired
	private DataBean4 data2;
	// DataBean4 타입(클래스)으로 등록된 Bean을 data4에 주입해라 / setter가 필요없다. 
	
	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public DataBean4 getData2() {
		return data2;
	}
	public void setData2(DataBean4 data2) {
		this.data2 = data2;
	}
	
}
