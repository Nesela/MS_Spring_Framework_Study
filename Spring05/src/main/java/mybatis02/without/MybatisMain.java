package mybatis02.without;

import mybatis02.without.BoardDto;
import mybatis02.without.BoardMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static mybatis02.without.MybatisConfig.getSqlSessionFactory;

public class MybatisMain {
    void main() {
        try (SqlSession session = getSqlSessionFactory().openSession()) {
            BoardMapper mapper = session.getMapper(BoardMapper.class);

            List<BoardDto> list = mapper.selectAll();
            list.forEach(IO::println);

            BoardDto insert = new BoardDto("hong-gd", "test", "content");
            int insertRes = mapper.insert(insert);
            if (insertRes > 0) {
                session.commit();
            }

            BoardDto byId = mapper.selectById(1);
            IO.println(byId);
        }
    }
}
