package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBean4 {
	private int data1;
	private String data2;
	@Autowired
	private DataBean4 data4;
	//DataBean5 클래스의 빈(객체)가 있으면 그 주소값을 data5에 대입시켜라. 
	@Autowired //Bean에서 DataBean5와 같은 클래스(타입)을 찾아서 data5에 자동으로 주입시킨다. 
	private DataBean5 data5;
	
	// 1. 멤버면수에 자동주입 data4, data5
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public void setData2(String data2) {
		this.data2 = data2;
	}
	public void setData4(DataBean4 data4) {
		this.data4 = data4;
	}
	public void setData5(DataBean5 data5) {
		this.data5 = data5;
	}
	
}
