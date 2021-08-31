package kr.hs.study.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import kr.hs.study.model.dto.TestDTO;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String c = request.getParameter("c");
		System.out.print("a" + a);
		System.out.print(" b" + b);
		System.out.print(" c" + c);
		return "result";
	}
	
	@GetMapping("/test2")
	public String test2(HttpServletRequest request) {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		String[] c = request.getParameterValues("c");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		for(String value : c) {
			System.out.println("c : " + value + " ");
		}
		
		return "result";
	}
	
	@GetMapping("/test3")
	public String test3_get() {
		return "login-form";
	}
	
	@PostMapping("/test3")
	public String test3_post(HttpServletRequest request) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println("id : " + id);
		System.out.println("pw : " + pw);
		return "result";
	}
	
	@GetMapping("/test4")
	public String test4(WebRequest request) {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		System.out.print("a" + a);
		System.out.print(" b" + b);
		return "result";
	}
	
	
	@GetMapping("/test5/{a}/{b}/{c}")
	public String test5(@PathVariable int a, @PathVariable int b, @PathVariable int c) { //PathVariable은 형변환 가능 
		System.out.println("a : " + a); 
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		return "result";
	}
	
	
	@GetMapping("/test6")
	public String test6(@RequestParam (value="a")int aa, @RequestParam int b, @RequestParam int c) { // 이름 똑같게 해야하지만 다르게 하고 싶을때는 value=이 필요
		System.out.println(aa);
		System.out.println(b);
		System.out.println(c);
		return  "result";

		
	}
	
	@GetMapping("/test7")
	public String test7(@RequestParam int a, @RequestParam int b, @RequestParam int c[]) {
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		for(int i : c) {
			System.out.println("c : " + i);
		}
		return "result";
	}
	
	@GetMapping("/test8")
	public String test8(@RequestParam int a, @RequestParam int b, @RequestParam int c, @RequestParam String d) { // 더 적을땐 에러가 나지 않고 넘긴 값보다 더 넘겨받으면 에러 / required=false -> 넘어오는 값이 없으면 자동으로 null 삽입
		System.out.println("a : " + a);      
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("d : " + d);
		return "result";
	}
	
	@GetMapping("/test9")
	public String test9(@RequestParam Map<String, String> map) {
		String a= map.get("a");
		String b = map.get("b");
		String c = map.get("c");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		return "result";
	}
	
	@GetMapping("/test10")
	public String test10(@RequestParam Map<String, String> map, @RequestParam List<String> c) {
		String a = map.get("a");
		String b = map.get("b");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		for(String val : c) {
			System.out.println("c : " + val);
		}
		
		return "result";
	}
	
	
	
	@GetMapping("/test11")
	public String test11(@ModelAttribute TestDTO dto) { //ModelAttribute 는 생략 가능 
		System.out.println(dto.getA());
		System.out.println(dto.getB());
		System.out.println(dto.getC());
		return "result";
	}
	
	
	
	
	
	
	
	
	
	

	
	
}
