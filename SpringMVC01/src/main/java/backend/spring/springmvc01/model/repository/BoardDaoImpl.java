package backend.spring.springmvc01.model.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import backend.spring.springmvc01.model.dto.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao{

    private final SqlSessionTemplate session;

    @Autowired
    public BoardDaoImpl(SqlSessionTemplate session) {
        this.session = session;
    }
    @Override
    public List<BoardDto> findAll() {
        return session.selectList(NAMESPACE + "findAll");
    }

    @Override
    public BoardDto findById(int id) {
        return session.selectOne(NAMESPACE + "findById", id);
    }

    @Override
    public int insert(BoardDto dto) {
        return session.insert(NAMESPACE + "insert", dto);
    }

    @Override
    public int update(BoardDto dto) {
        return session.update(NAMESPACE + "update", dto);
    }

    @Override
    public int delete(int id) {
        return session.delete(NAMESPACE + "delete", id);
    }
}
