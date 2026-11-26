package backend.spring.springmvc01.service;

import backend.spring.springmvc01.model.dto.BoardDto;

import java.util.List;

public interface BoardBiz {
    List<BoardDto> findAll();
    BoardDto findById(int id);
    int insert(BoardDto dto);
    int update(BoardDto dto);
    int delete(int id);
}

