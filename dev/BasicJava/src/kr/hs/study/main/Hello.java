package kr.hs.study.main;

import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKo;
import kr.hs.study.beans.*;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		helloInter hello = new HelloWorldEn();
		//�θ� �ڽ��� ���� 
		
		hello.sayHello();
		
		helloInter helloKo = new HelloWorldKo();
		helloKo.sayHello();
	}

}
