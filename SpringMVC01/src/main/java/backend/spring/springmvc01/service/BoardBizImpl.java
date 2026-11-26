package backend.spring.springmvc01.service;

import backend.spring.springmvc01.model.dto.BoardDto;
import backend.spring.springmvc01.model.repository.BoardDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardBizImpl implements BoardBiz{
    private final BoardDao dao;

    public BoardBizImpl(BoardDao dao){
        this.dao = dao;
    }

    @Override
    public List<BoardDto> findAll() {
        return dao.findAll();
    }

    @Override
    public BoardDto findById(int id) {
        return dao.findById(id);
    }

    @Override
    public int insert(BoardDto dto) {
        return dao.insert(dto);
    }

    @Override
    public int update(BoardDto dto) {
        return dao.update(dto);
    }

    @Override
    public int delete(int id) {
        return dao.delete(id);
    }
}
