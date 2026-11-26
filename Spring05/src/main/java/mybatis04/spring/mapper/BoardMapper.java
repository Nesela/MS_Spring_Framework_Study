package mybatis04.spring.mapper;

import mybatis04.spring.dto.BoardDto;

import java.util.List;

public interface BoardMapper {

    List<BoardDto> selectAll();
    BoardDto selectById(int id);
    int insert(BoardDto dto);
    int update(BoardDto dto);
    int delete(int id);

}