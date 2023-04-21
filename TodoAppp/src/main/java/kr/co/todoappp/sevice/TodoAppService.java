package kr.co.todoappp.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.todoappp.dao.TodoAppDAO;
import kr.co.todoappp.vo.TodoAppVO;

@Service
public class TodoAppService {

	@Autowired
	private TodoAppDAO dao;
	
	public int insertTodo(TodoAppVO vo) {
		return dao.insertTodo(vo);
	};
	public List<TodoAppVO> selectTodos(){
		return dao.selectTodos();
	};
}
