package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Test;
import kr.hs.study.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// 컨테이너의 config.xml 파일을 읽어온다. 
		// 객체의 생성자 호출, xml 파일 로딩할때(config 파일을 읽을 때) 객체가 생성된다. 
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		
		Test t1 = ctx.getBean("t1", TestBean.class);
		System.out.println("t1:" + t1);
		
		Test t2 = ctx.getBean("t1", TestBean.class);
		System.out.println("t2: " + t2);
		
		Test t3 = ctx.getBean("t1", TestBean.class);
		System.out.println("t3: " + t3);
		
		
/*		// 객체를 가지고온다. getBean()의 리턴값 : object
		TestBean t1 = ctx.getBean(TestBean.class); //클래스로
		t1.method();
		
//		TestBean t2 = (TestBean) ctx.getBean("t2"); //id로
//		t2.method();
		
		
		// 싱글톤(singleton) : 주소 똑같다. 처음 가져온 객체는 계속 사용된다. 새로 생성되지 않는다. 
		Test t2 = ctx.getBean("t2", TestBean.class);
		t2.method();
		System.out.println("T2: " + t2);
		
		Test t3 = ctx.getBean("t2", TestBean.class);
		System.out.println("T3: " + t3);
		
		Test t4 = ctx.getBean("t2", TestBean.class);
		System.out.println("T4: " + t4);
		*/
		
		ctx.close(); // 컨테이너 종료
	}

}


