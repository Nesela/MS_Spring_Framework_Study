package mybatis03.dynamic;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BoardMapper {

    List<BoardDto> selectAll();

    List<BoardDto> search(BoardDto condition);

    List<BoardDto> searchByType(@Param("type") String type,@Param("keyword") String keyword);

    int dynamicUpdate(BoardDto dto);

    List<BoardDto> selectByIdList(@Param("ids") List<Integer> ids);
}
