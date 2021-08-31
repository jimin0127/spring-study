package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import kr.hs.study.beans.TestBean5;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean1 t1 = ctx1.getBean("t1", TestBean1.class); 
		System.out.println("t1 : " + t1);
		
		TestBean2 t2 = ctx1.getBean(TestBean2.class);
		System.out.println("t2 : " + t2);
		
		TestBean3 t3 = ctx1.getBean(TestBean3.class);
		System.out.println("t3 : " + t3);
		
		TestBean3 t4 = ctx1.getBean(TestBean3.class);
		System.out.println("t4 : " + t4);
		
		TestBean4 t5 = ctx1.getBean(TestBean4.class);
		System.out.println("t5 : " + t5);

		TestBean5 t6 = ctx1.getBean(TestBean5.class);
		System.out.println("t6 : " + t6);
		System.out.println("Data1 " + t6.getA());
		System.out.println("Data2 " + t6.getB());
		System.out.println("Data3 " + t6.getData4());
		System.out.println("Data4 " + t6.getData5());
		System.out.println();
		
		/*
		 * TestBean5 t7 = ctx1.getBean("test5", TestBean5.class);
		 * System.out.println(t7.getA());
		 */
		
		ctx1.close();
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
		TestBean1 d1 = ctx2.getBean("t1", TestBean1.class);
		TestBean2 d2 = ctx2.getBean(TestBean2.class);
		System.out.println("d1 : " + d1);
		System.out.println("d2 : " + d2);
		
		
		TestBean5 d3 = ctx2.getBean(TestBean5.class);
		System.out.println("d3 : " + d3);
		System.out.println("Data1 " + d3.getA());
		System.out.println("Data2 " + d3.getB());
		System.out.println("Data3 " + d3.getData4());
		System.out.println("Data4 " + d3.getData5());
		System.out.println();		
		
		
		ctx2.close();
	}

}
