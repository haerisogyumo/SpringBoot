package kr.co.ch07.controller;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.ch07.service.User3Service;
import kr.co.ch07.vo.User3VO;

@MapperScan("kr.co.ch07.dao")
@Controller
public class User3Controller {
	
	@Autowired
	private User3Service service;

	@GetMapping("/user3/list")
	public String list(Model model) {
		List<User3VO> users = service.selectUser3s();
		model.addAttribute("users", users);
		return "/user3/list";
	}
	

	@GetMapping("/user3/modify")
	public String modify(Model model, String uid) {
		User3VO user3 = service.selectUser3(uid);
		model.addAttribute("user3", user3);
		return "/user3/modify";
	}

	@PostMapping("/user3/modify")
	public String modify(User3VO vo) {
		service.updateUser3(vo);
		return "redirect:/user3/list";
	}
	

	@GetMapping("/user3/register")
	public String register() {
		return "/user3/register";
	}
	
	@PostMapping("/user3/register")
	public String register(User3VO vo) {
		service.insertUser3(vo);
		return "redirect:/user3/list";
	}

	@GetMapping("/user3/delete")
	public String delete(String uid) {
		service.deleteUser3(uid);
		return "redirect:/user3/list";
	}

}