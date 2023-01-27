package kr.co.sboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sboard.dao.TermsDAO;
import kr.co.sboard.vo.TermsVO;

@Service
public class TermsService {

	@Autowired
	public TermsDAO dao;
	
	public TermsVO selectTerms() {
		return dao.selectTerms();
	};
}