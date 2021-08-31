package kr.hs.study.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.DataBean3;
import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;

//설정파일 annotation
@Configuration
public class JavaConfig {
//	<bean id = "java1" class = "kr.hs.study.TestBean2">
	@Bean(name="obj2")
	public TestBean2 java1() { // 메서드 이름이 id
		TestBean2 t1 = new TestBean2();
		return t1;
	}
	
	// 객체 생성 lazy-init = "true"
	@Bean(name="obj3")
	@Lazy
	public TestBean2 obj3() {
		return new TestBean2();
	}
	
	// 객체 생성 id = "init" scope = "prototype"
	@Bean(initMethod = "init")
	@Scope("prototype")
	public TestBean2 obj4() {
		return new TestBean2();
	}
	
	//자바로 하는 constructor DI
	@Bean
	public TestBean3 obj5() {
		TestBean3 t3 = new TestBean3(300, "spring3", new DataBean3());
		return t3;
	}
	
	
	//자바로 하는 setter DI
	@Bean
	public TestBean3 obj6() {
		//setter 500, spring5, 객체 
		TestBean3 t4 = new TestBean3();
		t4.setA(500);
		t4.setB("spring5");
		t4.setC(new DataBean3());
		
		return t4;
		
	}
	
	@Bean
	public DataBean4 b1() {
		return new DataBean4();
	}
	
	@Bean
	public TestBean4 obj7() {
		return new TestBean4();
	}
}
