package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.LgTv;
import kr.hs.study.beans.Tv;
import kr.hs.study.beans.samsungTv;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Tv samsung = ctx.getBean("samsung", samsungTv.class);
		Tv Lg = ctx.getBean("Lg", LgTv.class);
		
		samsung.powerOn();
		Lg.powerOn();
	}

}
