package kr.co.ch09.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.ch09.service.MemberService;
import kr.co.ch09.vo.MemberVO;

@RestController
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	LocalDateTime time = LocalDateTime.now();
	
	@GetMapping("")
	public List<MemberVO> list() {
		//List<MemberVO> users = service.selectMembers();
		//return users;
		return service.selectMembers();
	}
	
	@GetMapping("/{uid}")
	public void list(String[] cartNo) {
		
	}

	@PostMapping("")
	public int register(MemberVO vo) {
		vo.setRdate(time);
		service.insertMember(vo);
		
		int result = 1;
		return result;
	}

	@PutMapping("")
	public void modify(MemberVO vo) {
		vo.setRdate(time);
		service.updateMember(vo);
	}
	
	@DeleteMapping("/{uid}")
	public int delete(@PathVariable("uid") String uid) {
		service.deleteMember(uid);
		
		int result = 1;
		return result;
	}

}
