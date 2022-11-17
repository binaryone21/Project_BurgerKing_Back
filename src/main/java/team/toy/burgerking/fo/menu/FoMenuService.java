package team.toy.burgerking.fo.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Service
public class FoMenuService {

    @Autowired
    private FoMenuRepository foMenuRepository;

    // 메뉴소개 목록
    public Map<String, Object> menuList(HttpServletRequest req) {
        Map<String, Object> params = new HashMap<>();
        params.put("menu_cd", "MN02");

        Map<String, Object> result = new HashMap<>();
        result.put("menuList", foMenuRepository.arraysMenu());
        result.put("productList", foMenuRepository.arraysProduct(params));
        return result;
    }

    // 메뉴소개 조회
    public Map<String, Object> menuView(HttpServletRequest req) {
        Map<String, Object> params = new HashMap<>();
        params.put("product_seq", "5");

        Map<String, Object> result = new HashMap<>();
        result.put("product", foMenuRepository.selectProduct(params));
        result.put("productDetail", foMenuRepository.arraysProductItem(params));
        return result;
    }
}
