package kr.co.ch07.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch07.repository.User2Repo;
import kr.co.ch07.vo.User2VO;

@Service
public class User2Service {

	//@Autowired
	//private User2DAO dao;
	
	@Autowired
	private User2Repo repo;
	
	public void insertUser2(User2VO vo) {
		// mybatis
		//dao.insertUser2(vo);
		
		// JPA
		repo.save(vo);
	}
	public User2VO selectUser2(String uid) {
		// mybatis 
		// User2VO vo = dao.selectUser2(uid);
		
		// JPA
		User2VO vo = repo.findById(uid).get();
		return vo;
	}
	
	public List<User2VO> selectUser2s() {
		// Mybatis 
		// List<User2VO> user2s = dao.selectUser2s();
		 
		// JPA
		List<User2VO> user2s = repo.findAll();
		 return user2s;
	}
	
	public void updateUser2(User2VO vo) {
		// Mybatis
		// dao.updateUser2(vo);
		
		// JPA
		repo.save(vo);
	}
	
	public void deleteUser2(String uid) {
		// Mybatis
		// dao.deleteUser2(uid);
		
		// JPA
		repo.deleteById(uid);
	}
	
}
