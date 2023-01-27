package kr.co.farmstory.dao;

import kr.co.farmstory.vo.ArticleVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleDAO {

    public void insertArticle(ArticleVO vo);
    public ArticleVO selectArticle(int no);
    public List<ArticleVO> selectArticles(String cate);
    public void updateArticle(ArticleVO vo);
    public void deleteArticle(int no);



};
