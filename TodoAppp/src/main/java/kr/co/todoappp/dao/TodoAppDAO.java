package kr.co.todoappp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.co.todoappp.vo.TodoAppVO;

@Mapper
@Repository
public interface TodoAppDAO {
	
	public int insertTodo(TodoAppVO vo);
	public List<TodoAppVO> selectTodos();

}
