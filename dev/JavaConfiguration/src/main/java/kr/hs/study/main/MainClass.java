package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		//xml 설정
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
//		TestBean1 t1 = ctx1.getBean("obj1", TestBean1.class);
//		System.out.println("t1 : " + t1);
		TestBean2 t2 = ctx1.getBean("obj1", TestBean2.class);
		t2.pr();
		
		TestBean2 t3 = ctx1.getBean("obj6", TestBean2.class);
		t3.pr();
		System.out.println("t3: " + t3);
		
		TestBean2 t4 = ctx1.getBean("obj6", TestBean2.class);
		t4.pr();
		System.out.println("t4: " + t4);
		
		TestBean3 t5 = ctx1.getBean("obj7", TestBean3.class);
		System.out.println("t5: " + t5);
		
		ctx1.close();
				
		
		System.out.println("=============================");
		//자바 설정
		//설정이 있는 자바 파일 등록
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		//TestBean2 t2 = ctx2.getBean("java1", TestBean2.class);
		//t2.pr();
		
		TestBean2 obj2 = ctx2.getBean("obj2", TestBean2.class);
		obj2.pr();
		
		TestBean2 obj3 = ctx2.getBean("obj3", TestBean2.class);
		obj3.pr();
		
		TestBean2 obj4 = ctx2.getBean("obj4", TestBean2.class);
		obj4.pr();
		
		TestBean3 obj5 = ctx2.getBean("obj5", TestBean3.class);
		System.out.println("obj5 : " + obj5);
		
		TestBean3 obj6 = ctx2.getBean("obj6", TestBean3.class);
		System.out.println("obj6 : " + obj6);
		
		TestBean4 obj7 = ctx2.getBean("obj7", TestBean4.class);
		System.out.println("t7.Data1 : " + obj7.getData1() + " t7.Data2 : " + obj7.getData2());
		
		ctx2.close();
	}

}
