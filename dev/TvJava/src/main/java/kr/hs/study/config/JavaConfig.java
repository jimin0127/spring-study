package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.AppleSpeaker;
import kr.hs.study.beans.LgTv;
import kr.hs.study.beans.SamSpeaker;
import kr.hs.study.beans.SamsungTv;

@Configuration
public class JavaConfig {
	@Bean
	public SamsungTv samsungTv() {
		return new SamsungTv(200);
	}
	
	@Bean
	public LgTv lgTv() {
		return new LgTv(100);
	}
	
	@Bean
	public SamSpeaker SamSpeaker() {
		return new SamSpeaker();
	}
	
	@Bean
	public AppleSpeaker AppleSpeaker() {
		return new AppleSpeaker();
	}
}
