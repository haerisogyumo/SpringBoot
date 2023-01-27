package kr.co.sboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import kr.co.sboard.dao.UserDAO;
import kr.co.sboard.repository.UserRepo;
import kr.co.sboard.vo.UserVO;

@Service
public class UserService {

	@Autowired
	private UserDAO dao;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepo repo;
	
	public int insertUser(UserVO vo) {
		vo.setPass(passwordEncoder.encode(vo.getPass2()));
		
		int result = dao.insertUser(vo);
		return result;
	};
	public UserVO selectUser(String uid) {
		return dao.selectUser(uid);
	};
	public List<UserVO> selectUsers() {
		return dao.selectUsers();
	};
	public void updateUser(UserVO vo) {
		dao.updateUser(vo);
	};
	public void deleteUser(String uid) {
		dao.deleteUser(uid);
	};
	
	public int countUser(String uid) {
		return repo.countByUid(uid);
	}
	public int countNick(String nick) {
		return repo.countByNick(nick);
	}
	
	
}