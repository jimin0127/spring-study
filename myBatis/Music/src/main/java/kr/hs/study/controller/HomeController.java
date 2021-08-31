package kr.hs.study.controller;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.model.dto.MusicDTO;

@Controller
public class HomeController {
	@Autowired
	SqlSessionTemplate sqlsessiontemplate;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	@GetMapping("/music_list")
	public String list(Model model) {
		List<MusicDTO> list = sqlsessiontemplate.selectList("music.list");
		model.addAttribute("list", list);
		return "music_list";
	}
	
	@GetMapping("/music_add")
	public String add() {
		return "music_add";
	}
	
	@GetMapping("/music_search")
	public String search() {
		return "music_search";
	}

	@PostMapping("/music_add")
	public String add(MusicDTO dto) {
		sqlsessiontemplate.insert("music.add", dto);
		return "index";
	}
	
	@GetMapping("/edit")
	public String edit(@RequestParam int id, Model model) {
		MusicDTO dto = sqlsessiontemplate.selectOne("music.selectOne", id);
		model.addAttribute("dto", dto);
		return "edit";
	}
	
	@PostMapping("/edit")
	public String edit_post(@RequestParam int id, MusicDTO dto) {
		dto.setId(id);
		sqlsessiontemplate.update("music.update", dto);
		return "index";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam int id, Model model) {
		MusicDTO dto = sqlsessiontemplate.selectOne("music.selectOne", id);
		model.addAttribute("dto", dto);
		return "delete";
	}
	
	@GetMapping("/delete_ok")
	public String delete_ok(@RequestParam int id) {
		sqlsessiontemplate.delete("music.delete", id);
		return "index";
	}	
	
	@PostMapping("/music_search")
	public String searching(@RequestParam String title, Model model) {
		List<MusicDTO> list = sqlsessiontemplate.selectList("music.search", title);
		model.addAttribute("list", list);
		return "music_search";
	}
}
