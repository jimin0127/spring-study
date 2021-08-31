package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@GetMapping("/gugudan")
	public String gugudan() {
		
		return "gugudan";
	}
	
	@PostMapping("/gugudan")
	public String gugudan_result(@RequestParam int dan, Model model) {
		String result = "";
		for(int i = 2; i <= 9; i++) {
			result += dan + "*" + i + "=" + dan * i + "<br>";
		}
		model.addAttribute("result", result);
		return "gugudan_result";
	}
	
	@GetMapping("/nmsum")
	public String nmsum() {
		return "nmsum";
	}
	
	@PostMapping("/nmsum")
	public String nmsum(@RequestParam int n, @RequestParam int m, Model model) {
		int sum = 0;
		for(int i = n; i <= m; i++) {
			sum += i;
		}
		model.addAttribute("result", sum);
		return "nmsum_result";
	}
}
