package mybatis02.without;

import mybatis02.without.BoardDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BoardMapper {

    @Select("""
        SELECT *
        FROM board
    """)
    List<BoardDto> selectAll();

    @Select("""
        SELECT *
        FROM board
        WHERE id = #{id}
    """)
    BoardDto selectById(@Param("id") int id);

    @Insert("""
        INSERT INTO board (writer, title, content)
        VALUES (#{writer}, #{title}, #{content})
    """)
    int insert(BoardDto dto);

    @Update("""
        UPDATE board
            SET writer = #{writer},title = #{title},content = #{content}
            WHERE id = #{id}
    """)
    int update(BoardDto dto);

    @Delete("""
        DELETE FROM board
        WHERE id = #{id}
    """)
    int delete(@Param("id") int id);

}
