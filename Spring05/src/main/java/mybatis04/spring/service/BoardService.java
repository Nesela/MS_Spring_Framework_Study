package mybatis04.spring.service;

import mybatis04.spring.dto.BoardDto;
import mybatis04.spring.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    private final BoardMapper mapper;

//    @Autowired
    public BoardService(BoardMapper mapper) {
        this.mapper = mapper;
    }

    public List<BoardDto> selectAll() {
        return mapper.selectAll();
    }

    public BoardDto selectById(int id) {
        return mapper.selectById(id);
    }

    public int insert(BoardDto dto) {
        return mapper.insert(dto);
    }

    public int update(BoardDto dto) {
        return mapper.update(dto);
    }

    public int delete(int id) {
        return mapper.delete(id);
    }
}