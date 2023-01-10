package kr.co.ch07.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class User2Controller {

	@GetMapping("/user2/list")
	public String list() {
		return "/user2/list";
	}
	
	@GetMapping("/user2/register")
	public String register() {
		return "/user2/register";
	}
	
	@PostMapping("/user2/register")
	public String register() {
		return "redirect:/user2/list";
	}

	@GetMapping("/user2/modify")
	public String modify() {
		return "/user2/modify";
	}

	@PostMapping("/user2/modify")
	public String modify() {
		return "redirect:/user2/list";
	}

	@GetMapping("/user2/delete")
	public String delete() {
		return "redirect:/user2/list";
	}

}