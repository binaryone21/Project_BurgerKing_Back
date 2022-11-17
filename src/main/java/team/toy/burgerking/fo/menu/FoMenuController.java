package team.toy.burgerking.fo.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RequestMapping("/fo/menu")
@Controller
public class FoMenuController {

    @Autowired
    private FoMenuService foMenuService;

    // 메뉴소개 목록 페이지
    @GetMapping("/menuListPage")
    public String menuListPage() {
        return "/";
    }

    // 메뉴소개 목록
    @PostMapping("/menuList.ajax")
    public Map<String, Object> menuListAjax(HttpServletRequest req) {
        return foMenuService.menuList(req);
    }

    // 메뉴소개 조회 페이지
    @GetMapping("/menuViewPage")
    public String menuViewPage() {
        return "/";
    }

    // 메뉴소개 조회
    @PostMapping("/menuView.ajax")
    public Map<String, Object> menuViewAjax(HttpServletRequest req) {
        return foMenuService.menuView(req);
    }
}
