package kr.hs.study.main;

import kr.hs.study.beans.Person;

// pojo Ŭ���� �׽�Ʈ
public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������� �ڵ�� ������, setter, getter�� �ۼ��� �ʿ���� 
		// �������� �ڵ����� ����(IOC)
		Person p1 = new Person("kim", 30);
		p1.setName("kim");
		p1.setAge(30);
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		System.out.println("================");
		
		Person p2 = new Person("lee", 25);
		System.out.println("�̸��� " + p2.getName());
		System.out.println("���̴� " + p2.getAge());
	}

}
