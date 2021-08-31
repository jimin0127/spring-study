package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.dto.TestDTO;

@Controller
public class TestController {
	@GetMapping("/form")
	public String form() {
		return "form";
	}
	
	@PostMapping("/score")
	public String score(@ModelAttribute TestDTO dto, Model model) {
		model.addAttribute("name", dto.getName());
		model.addAttribute("kor", dto.getKor());
		model.addAttribute("eng", dto.getEng());
		model.addAttribute("math", dto.getMath());
		model.addAttribute("sum", dto.getSum());
		model.addAttribute("avg", dto.getAvg());
		return "result";
	}
}
