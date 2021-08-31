package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.LgTv;
import kr.hs.study.beans.SamsungTv;
import kr.hs.study.config.JavaConfig;

public class TvUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx1 = new AnnotationConfigApplicationContext(JavaConfig.class);
		SamsungTv samTv = ctx1.getBean("samsungTv", SamsungTv.class);
		LgTv lgTv = ctx1.getBean("lgTv", LgTv.class);
		samTv.PowerOff();
		samTv.getSpeaker().VolumeDown();
		System.out.println(samTv.getPrice());
		lgTv.PowerOn();
		lgTv.getSpeaker().VolumeUP();
	}
}
