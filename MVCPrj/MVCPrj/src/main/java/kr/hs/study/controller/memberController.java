package kr.hs.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.model.dto.memberDTO;
import kr.hs.study.service.MemberServiceImpl;

@Controller
public class memberController {
	
	@Autowired
	MemberServiceImpl memberservice;
	
	@GetMapping("/member")
	public String member(Model model) {
		List<memberDTO> list = memberservice.list();
		System.out.println(list);
		model.addAttribute("list", list);
		return "member/list";	
	}
	
	@GetMapping("/join")
	public String join() {
		return "member/join";
	}
	
	@PostMapping("/join")
	public String _join(memberDTO dto) {
		memberservice.join(dto);
		return "index";
	}
	
	@GetMapping("/member/read")
	public String read(@RequestParam String userid, Model model) {
		memberDTO member = memberservice.read(userid);
		model.addAttribute("member", member);
		return "member/read";
	}
	
	@PostMapping("/member/update")
	public String update(memberDTO dto, Model model) {
		boolean result = memberservice.check(dto.getUserid(), dto.getPassword());
		System.out.println("result " + result);
		if(result) {
			memberservice.update(dto, dto.getUserid());
			return "redirect:/member";
		}else {
			memberDTO dto2 = memberservice.read(dto.getUserid());
			model.addAttribute("dto", dto);
			return "member/read";
		}
	}
}
