package kr.co.todoappp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.todoappp.sevice.TodoAppService;
import kr.co.todoappp.vo.TodoAppVO;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
public class TodoAppController {
	
	@Autowired
	private TodoAppService service;
	
	@ResponseBody
	@CrossOrigin(origins = "*")
	@PostMapping("/insert")
	public int insertTodo(@RequestBody TodoAppVO vo) {
		log.info("insert ...");
		return service.insertTodo(vo);
	};
	
	@ResponseBody
	@CrossOrigin(origins = "*")
	@GetMapping("/select")
	public List<TodoAppVO> selectTodos(){
		return service.selectTodos();
	};

}
