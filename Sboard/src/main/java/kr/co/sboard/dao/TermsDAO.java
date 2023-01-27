package kr.co.sboard.dao;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.sboard.vo.TermsVO;

@Mapper
@Repository
public class TermsDAO {

	@Autowired
	private SqlSessionTemplate myBatis;
	
	public TermsVO selectTerms() {
		return myBatis.selectOne("terms.selectTerms");
	};
}