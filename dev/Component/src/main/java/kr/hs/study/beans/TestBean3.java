package kr.hs.study.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj3")
@Lazy
@Scope("prototype")
public class TestBean3 {
	public TestBean3() {
		System.out.println("TestBean3의 생성자");
	}
	@PostConstruct
	public void init_method() {
		System.out.println("TestBean3의 init method");
	}
	
	@PreDestroy
	public void des_method() {
		System.out.println("TestBean3의 des method");
	}
}
