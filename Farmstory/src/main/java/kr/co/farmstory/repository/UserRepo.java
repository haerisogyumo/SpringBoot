package kr.co.farmstory.repository;

import kr.co.farmstory.entitiy.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity, String> {
	
	public int countByUid(String uid);
	

}
