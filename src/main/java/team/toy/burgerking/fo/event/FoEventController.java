package team.toy.burgerking.fo.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RequestMapping("/fo/event")
@Controller
public class FoEventController {

    @Autowired
    private FoEventService foEventService;

    // 이벤트 목록 페이지
    @GetMapping("/eventListPage")
    public String eventListPage() {
        return "";
    }

    // 이벤트 목록
    @PostMapping("/eventList.ajax")
    public Map<String, Object> eventListAjax(HttpServletRequest req) {
        return foEventService.eventList(req);
    }

    // 이벤트 조회 페이지
    @GetMapping("/eventViewPage")
    public String eventViewPage() {
        return "";
    }

    // 이벤트 조회
    @PostMapping("/eventView.ajax")
    public Map<String, Object> eventViewAjax(HttpServletRequest req) {
        return foEventService.eventView(req);
    }
}
