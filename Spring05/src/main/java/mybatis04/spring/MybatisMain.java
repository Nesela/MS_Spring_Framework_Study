package mybatis04.spring;

import mybatis04.spring.dto.BoardDto;
import mybatis04.spring.service.BoardService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisMain {
    void main() {
        try (ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml")){
            BoardService service = factory.getBean(BoardService.class);

            service.selectAll().forEach(IO::println);

            BoardDto byId =service.selectById(5);
            IO.println(byId);

            BoardDto insert = new BoardDto("spring", "spring-mybatis", "easy!");
            int insertRes = service.insert(insert);
            if (insertRes > 0) {
                IO.println("insert 성공!!");
            }

            BoardDto update = new BoardDto("spring", "어렵나?", "진짜어렵다");
            update.setId(7);
            int updateRes = service.update(update);
            if (updateRes > 0) {
                IO.println("update 성공!!");
            }

            int deleteRes = service.delete(5);
            if (deleteRes > 0){
                IO.println("delete 성공!!");
            }

            service.selectAll().forEach(IO::println);
        }
    }
}
