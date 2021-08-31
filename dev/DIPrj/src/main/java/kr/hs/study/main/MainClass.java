package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.CarUser;

public class MainClass {
	public static void main(String args[]) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");

		
		CarUser u1 = ctx.getBean("CarUser1", CarUser.class);
		u1.prData();
		
		CarUser u2 = ctx.getBean("CarUser2", CarUser.class);
		u2.prData();
		
		CarUser u3 = ctx.getBean("CarUser3", CarUser.class);
		u3.prData();
		
		ctx.close();
	}
}
