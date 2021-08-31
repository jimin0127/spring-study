package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.DataBean5;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean5;

@Configuration
public class JavaConfig {
	@Bean
	public TestBean1 t1(){
		return new TestBean1();
	}
	
	@Bean
	public TestBean2 t2() {
		return new TestBean2();
	}
	
	@Bean
	public DataBean4 d4() {
		return new DataBean4();
	}
	
	@Bean
	public DataBean5 d5() {
		return new DataBean5();
	}
	
	@Bean
	public TestBean5 t3() {
		TestBean5 t3 = new TestBean5();
		t3.setA(50);
		t3.setB(55.55);
		t3.setData4(new DataBean4());
		t3.setData5(new DataBean5());
		return t3;
	}
}
