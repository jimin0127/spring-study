package kr.hs.study.beans;

public class TestBean1 {
	private int data1;
	private double data2;
	private String data3;
	
	public TestBean1() {
		System.out.println("TestBean1의 기본 생성자");
		this.data1 = 0;
		this.data2 = 0.0;
		this.data3 = "string1";
	}
	
	
	public TestBean1(int data1) {
		System.out.println("TestBean1의 int 생성자");
		this.data1 = data1;
		this.data2 = 10.0;
		this.data3 = "string2";
	}
	//double 형 생성자 하나 만들어     20, 22.22   string3
	public TestBean1(double data2) {
		System.out.println("TestBean1의 double 생성자");
		this.data1 = 20;
		this.data2 = data2;
		this.data3 = "string3";
	}
	
	//string 1개 생성자 만들고 30 ,33.33  " string4

	public TestBean1(String data3) {
		System.out.println("TestBean1의 string 생성자");
		this.data1 = 30;
		this.data2 = 33.33;
		this.data3 = data3;
	}
	
	public TestBean1(int data1, double data2, String data3) {
		System.out.println("Test1의 int, double, String 생성자");
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
	}


	public void prData() {
		System.out.println("data1: " + data1);
		System.out.println("data2: " + data2);
		System.out.println("data3: " + data3);

	}

}
