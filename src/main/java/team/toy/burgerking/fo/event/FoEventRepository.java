package team.toy.burgerking.fo.event;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class FoEventRepository {

    @Autowired
    private SqlSession sqlSession;

    // 이벤트 목록
    public List<Map<String, Object>> arraysEvent(Map<String, Object> params) {
        return sqlSession.selectList("foEventMapper.arraysEvent", params);
    }

    // 이벤트 조회
    public Map<String, Object> selectEvent(Map<String, Object> params) {
        return sqlSession.selectOne("foEventMapper.selectEvent", params);
    }
}
