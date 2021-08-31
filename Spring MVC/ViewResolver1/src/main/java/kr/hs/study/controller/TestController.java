package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.hs.study.model.LoginDTO;
import kr.hs.study.model.ModelDTO;


@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1() {
		return "test1";
	}
	@GetMapping("/test2")
	public String test2(Model model) {
		model.addAttribute("id", "kim");
		model.addAttribute("password", "1111");
		return "test2";
	}
	@GetMapping("/test3")
	public String test3() {
		return "login_form";
	}
	
	@PostMapping("/test3")
	public String test3_form(LoginDTO dto, Model model){
		model.addAttribute("id", dto.getId());
		model.addAttribute("pw", dto.getPw());
		model.addAttribute("email", dto.getEmail());
		return "test3";
	}
	
	@GetMapping("/test4")
	public ModelAndView test4(ModelAndView mv) {
		mv.addObject("id", "lee");
		mv.addObject("password", "1111");
		mv.addObject("email", "lee@gamil.com");
		//View이름까지 세팅해야한다
		mv.setViewName("test4");
		return mv;
	}
	
	//객체에 담긴 값을 model에 담아서 view로 넘김
	@GetMapping("/test5")
	public String test5(@ModelAttribute ModelDTO dto, Model model) {
		model.addAttribute("a", dto.getA());
		model.addAttribute("b", dto.getB());
		model.addAttribute("c", dto.getC());

		return "test5";
	}
	
	// 객체에 담긴 값을 바로 view로 넘김(model 생략)
	@GetMapping("/test6")
	public String test6(@ModelAttribute ModelDTO dto) { //modelDTO로 이름 설정됨 클래스의 앞글자를 소문자로
		return "test6";
	}
	@GetMapping("/test7")
	public String test7(@ModelAttribute("sample") ModelDTO dto) { //modelDTO로 이름 설정됨 클래스의 앞글자를 소문자로
		return "test7";
	}
}
