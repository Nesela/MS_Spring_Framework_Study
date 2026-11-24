package mybatis01.basic;

import java.util.List;

public interface BoardMapper {

    List<BoardDto> selectAll();

    BoardDto selectById(int id);

    int insert(BoardDto dto);

    int update(BoardDto dto);

    int delete(int id);
}
