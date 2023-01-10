package kr.co.ch07.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch07.dao.User2DAO;
import kr.co.ch07.vo.User2VO;

@Service
public class User2Service {

	@Autowired
	private User2DAO dao;
	
	public void insertUser2(User2VO vo) {
		dao.insertUser2(vo);
	}
	public void selectUser2() {
		return dao.selectUser2(null);
	}
	public List<User2VO> selectUser2s() {
		return dao.selectUser2s();
	}
	public void updateUser2() {
		dao.updateUser2(null);
	}
	public void deleteUser2() {
		dao.deleteUser2(null);
	}
	
}
