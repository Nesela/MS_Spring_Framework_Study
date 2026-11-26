package mybatis03.dynamic;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisMain {
    public static SqlSessionFactory getSqlSessionFactory() {

        String resource = "mybatis03/dynamic/dynamic-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);

        return sqlSessionFactory;
    }

    void main() {
        try(SqlSession session = getSqlSessionFactory().openSession()) {
            BoardMapper mapper = session.getMapper(BoardMapper.class);

            mapper.selectAll().forEach(IO::println);

            IO.println("조건 검색");
            BoardDto condition01 = new BoardDto("kim-sd");
            List<BoardDto> conditionList01 = mapper.search(condition01);
            conditionList01.forEach(IO::println);

            BoardDto condition02 = new BoardDto("lee-ss", "third");
            List<BoardDto> conditionList02 = mapper.search(condition02);
            conditionList02.forEach(IO::println);

            IO.println("선택 검색");
            List<BoardDto> type01 = mapper.searchByType("writer", "hong");
            type01.forEach(IO::println);

            List<BoardDto> type02 = mapper.searchByType("title", "first");
            type02.forEach(IO::println);

            List<BoardDto> type03 = mapper.searchByType("content", "content");
            type03.forEach(IO::println);

            List<BoardDto> type04 = mapper.searchByType("", "");
            type04.forEach(IO::println);

            IO.println("동적 update");
            BoardDto update = new BoardDto();
            update.setId(4);
            update.setWriter("홍길동");
            update.setTitle("동적 쿼리 테스트");

            int updateRes = mapper.dynamicUpdate(update);
            if (updateRes > 0) {
                session.commit();
            }
            mapper.selectAll().forEach(IO::println);

            IO.println("여러 개의 id로 검색");
            List<Integer> ids = List.of(4, 5);
            mapper.selectByIdList(ids).forEach(IO::println);

        }
    }
}
