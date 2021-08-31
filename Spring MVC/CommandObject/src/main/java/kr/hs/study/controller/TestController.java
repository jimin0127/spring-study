package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.model.LoginDTO;
import kr.hs.study.model.ModelDTO;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1(@ModelAttribute ModelDTO dto) { // ModelDTO dto = new ModelDTO(); // ModelAttribute는 생략 가능
		System.out.println(dto.getA());
		System.out.println(dto.getB());
		System.out.println(dto.getC());
		return "result";
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "login_form";
	}
	
	@PostMapping("/test2")
	public String test2_post(@ModelAttribute LoginDTO dto) {
		System.out.println(dto.getId());
		System.out.println(dto.getPw());
		return "result";
	}
	
	@GetMapping("/test3")
	public String test3(@ModelAttribute ModelDTO dto) {
		System.out.println(dto.getA());
		System.out.println(dto.getB());
		int c[] = dto.getC();
		System.out.println(c[0]);
		System.out.println(c[1]);	
		System.out.println(c[2]);
		
		return "result";
	}
}
