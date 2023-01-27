package kr.co.farmstory.service;

import kr.co.farmstory.dao.ArticleDAO;
import kr.co.farmstory.vo.ArticleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleDAO dao;

    public void insertArticle(ArticleVO vo){
        dao.insertArticle(vo);
    };
    public ArticleVO selectArticle(int no){
        return dao.selectArticle(no);
    };
    public List<ArticleVO> selectArticles(String cate){
        return dao.selectArticles(cate);
    };
    public void updateArticle(ArticleVO vo){
        dao.updateArticle(vo);
    };
    public void deleteArticle(int no){
        dao.deleteArticle(no);
    };


}
