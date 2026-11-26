package backend.spring.springmvc01.model.repository;

import backend.spring.springmvc01.model.dto.BoardDto;

import java.util.List;

public interface BoardDao {
    String NAMESPACE = "board.";

    List<BoardDto> findAll();
    BoardDto findById(int id);
    int insert(BoardDto dto);
    int update(BoardDto dto);
    int delete(int id);
}
