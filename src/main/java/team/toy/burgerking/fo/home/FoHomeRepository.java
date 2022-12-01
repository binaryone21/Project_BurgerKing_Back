package team.toy.burgerking.fo.home;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class FoHomeRepository {

    @Autowired
    private SqlSession sqlSession;

    public List<Map<String, Object>> arraysHome() {
        return sqlSession.selectList("foHomeMapper.arraysHome");
    }
}
