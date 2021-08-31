package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.LgTv;
import kr.hs.study.beans.SamsungTv;
import kr.hs.study.beans.Tv;

public class TvUser {
	public static void main(String args[]) {
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		SamsungTv samTv = ctx1.getBean("SamsungTv", SamsungTv.class);
		LgTv lgTv = ctx1.getBean("LgTv", LgTv.class);
		
		samTv.PowerOn();
		samTv.getSpeaker().VolumeDown();
		samTv.PowerOff();
		
		lgTv.PowerOn();
		lgTv.getSpeaker().VolumeUP();
		
	}
}
