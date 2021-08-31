package kr.hs.study.main;

import kr.hs.study.beans.Person;

// pojo 클래스 테스트
public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스프링은 코드로 생성자, setter, getter를 작성할 필요없이 
		// 스프링이 자동으로 제어(IOC)
		Person p1 = new Person("kim", 30);
		p1.setName("kim");
		p1.setAge(30);
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		System.out.println("================");
		
		Person p2 = new Person("lee", 25);
		System.out.println("이름은 " + p2.getName());
		System.out.println("나이는 " + p2.getAge());
	}

}
