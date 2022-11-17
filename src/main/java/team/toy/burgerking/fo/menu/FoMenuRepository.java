package team.toy.burgerking.fo.menu;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class FoMenuRepository {

    @Autowired
    private SqlSession sqlSession;

    // 메뉴 목록
    public List<Map<String, Object>> arraysMenu() {
        return sqlSession.selectList("foMenuMapper.arraysMenu");
    }

    // 제품 목록
    public List<Map<String, Object>> arraysProduct(Map<String, Object> params) {
        return sqlSession.selectList("foMenuMapper.arraysProduct", params);
    }

    // 제품 조회
    public Map<String, Object> selectProduct(Map<String, Object> params) {
        return sqlSession.selectOne("foMenuMapper.selectProduct", params);
    }

    // 제품 아이템 목록
    public List<Map<String, Object>> arraysProductItem(Map<String, Object> params) {
        return sqlSession.selectList("foMenuMapper.arraysProductItem", params);
    }
}
