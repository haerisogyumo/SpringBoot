package kr.co.ch07.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch07.repository.User3Repo;
import kr.co.ch07.vo.User3VO;

@Service
public class User3Service {
	
	@Autowired
	private User3Repo repo;
	
	public void insertUser3(User3VO vo) {
		// JPA
		repo.save(vo);
	}
	
	public User3VO selectUser3(String uid) {
		// JPA
		User3VO vo = repo.findById(uid).get();
		return vo;
	}
	
	public List<User3VO> selectUser3s() {
		// JPA
		List<User3VO> user3s = repo.findAll();
		return user3s;
	}
	
	public void updateUser3(User3VO vo) {
		// JPA
		repo.save(vo);
	}
	
	public void deleteUser3(String uid) {
		// JPA
		repo.deleteById(uid);
	}

}
