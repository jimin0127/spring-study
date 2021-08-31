package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.model.UserDTO;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String register(UserDTO dto) {
		dto.setUser_name("kim");
		dto.setUser_id("kim_id");
		dto.setUser_pw("1111");
		dto.setUser_email("kim@gmail.com");
		dto.setUser_addr1("seoul");
		dto.setUser_addr2("kanak 353");
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2(UserDTO dto) {
		dto.setUser_name("lee");
		dto.setUser_id("lee_id");
		dto.setUser_pw("1111");
		dto.setUser_email("lee@gmail.com");
		dto.setUser_addr1("busan");
		dto.setUser_addr2("kanak 432");
		return "test2";
	}
	
	@GetMapping("/test3")
	public String test3(@ModelAttribute("user")UserDTO dto) {
		dto.setUser_name("eeeee");
		dto.setUser_id("lee_id");
		dto.setUser_pw("1111");
		dto.setUser_email("lee@gmail.com");
		dto.setUser_addr1("busan");
		dto.setUser_addr2("kanak 432");
		return "test3";
	}
	
}
