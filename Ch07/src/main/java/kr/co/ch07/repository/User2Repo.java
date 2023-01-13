package kr.co.ch07.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import kr.co.ch07.vo.User2VO;


// @Repository  <- 생략가능
public interface User2Repo extends JpaRepository<User2VO, String> {
	
	
	
	
}
