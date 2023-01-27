package kr.co.farmstory.controller;

import kr.co.farmstory.service.ArticleService;
import kr.co.farmstory.vo.ArticleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class BoardController {

    @Autowired
    private ArticleService service;

    @GetMapping("board/list")
    public String list(Model model, String group, String cate){
        model.addAttribute("group", group);
        model.addAttribute("cate", cate);
        List<ArticleVO> articles =  service.selectArticles(cate);
        model.addAttribute("articles", articles);

        return "board/list";
    }

    @GetMapping("board/modify")
    public String modify(Model model, String group, String cate, int no){

        model.addAttribute("group", group);
        model.addAttribute("cate", cate);
        ArticleVO article = service.selectArticle(no);
        model.addAttribute("article", article);

        return "board/modify";
    }
    @PostMapping("board/modify")
    public String modify(String group, String cate, ArticleVO vo){
        service.updateArticle(vo);
        return "redirect:/board/view?group="+group+"&cate="+cate+"&no="+vo.getNo();
    }

    @GetMapping("board/view")
    public String view(Model model, String group, String cate, int no){

        model.addAttribute("group", group);
        model.addAttribute("cate", cate);
        ArticleVO article = service.selectArticle(no);
        model.addAttribute("article", article);
        return "board/view";
    }

    @GetMapping("board/write")
    public String write(Model model, String group, String cate){

        model.addAttribute("group", group);
        model.addAttribute("cate", cate);

        return "board/write";
    }
    @PostMapping("board/write")
    public String write(String group, String cate, ArticleVO vo, HttpServletRequest req){
        vo.setRegip(req.getRemoteAddr());
        service.insertArticle(vo);
        return "redirect:/board/list?group="+group+"&cate="+cate;
    }

    @GetMapping("board/delete")
    public String delete(String group, String cate, int no){
        service.deleteArticle(no);
        return "redirect:/board/list?group="+group+"&cate="+cate;
    }
}
