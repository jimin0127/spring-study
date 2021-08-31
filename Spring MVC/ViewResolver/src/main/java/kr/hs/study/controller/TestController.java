package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import kr.hs.study.model.ModelDTO;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1() { // ModelDTO dto = new ModelDTO(); // ModelAttribute는 생략 가능
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2(HttpServletRequest request) {
		request.setAttribute("id", "kim");
		request.setAttribute("password", "1111");
		return "test2";
	}
}
