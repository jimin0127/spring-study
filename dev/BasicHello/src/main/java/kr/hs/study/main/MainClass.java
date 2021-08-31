package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Hello;
import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		//객체 읽어오기 
		Hello h1 = ctx.getBean("hello1", HelloWorldEn.class);
		// 다형성을 위해 앞에는 인터페이스를 사용
		h1.sayHello();
		
		
		// HelloWorldKo 객체 h2에 넣고 메서드 호출
		Hello h2 = ctx.getBean("hello2", HelloWorldKo.class);
		h2.sayHello();
		
		ctx.close();
		
	}

}
