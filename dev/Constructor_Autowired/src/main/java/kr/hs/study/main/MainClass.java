package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.JavaConfig;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean obj1 = ctx1.getBean("obj1", TestBean.class);
		
		System.out.println("obj1.getData3(): " + obj1.getData3());
		System.out.println("obj1.getData4(): " + obj1.getData4());
		
		ctx1.close();
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(JavaConfig.class);
		TestBean java1 = ctx2.getBean("java1", TestBean.class);
		System.out.println("java1.getData3(): " + java1.getData3());
		System.out.println("java1.getData4(): " + java1.getData4());
		
		ctx2.close();
	}

}
