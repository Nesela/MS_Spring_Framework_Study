package mybatis01.basic;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisMain {

    public static SqlSessionFactory getSqlSessionFactory() {

        String resource = "mybatis-config.xml";
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
        try (SqlSession session = getSqlSessionFactory().openSession()) {
//            BlogMapper mapper = session.getMapper(BlogMapper.class);
//            Blog blog = mapper.selectBlog(101);

            BoardMapper mapper = session.getMapper(BoardMapper.class);
            /*
            List<BoardDto> list = mapper.selectAll();
            list.forEach(IO::println);

            // 기본적으로 autoCommit false -> openSession(true) || sqlSession.comit();
            BoardDto insert = new BoardDto("hong-gd", "test title", "test content");
            int insert1Res = mapper.insert(insert);
            if (insert1Res > 0) {
                session.commit();
            }

            BoardDto byId = mapper.selectById(2);
            IO.println(byId);

            BoardDto update = new BoardDto(byId.id(), "홍길동", "테스트 제목", "테스트 내용", null);
            int updateRes = mapper.update(update);
            if (updateRes > 0){
                session.commit();
            }

            IO.println(mapper.selectById(byId.id()));
            */

            int deleteRes = mapper.delete(2);
            if (deleteRes > 0) {
                session.commit();
            }

            mapper.selectAll().forEach(IO::println);
        }
    }
}
