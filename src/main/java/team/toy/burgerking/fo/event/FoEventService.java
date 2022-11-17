package team.toy.burgerking.fo.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Service
public class FoEventService {

    @Autowired
    private FoEventRepository foEventRepository;

    // 이벤트 목록
    public Map<String, Object> eventList(HttpServletRequest req) {
        Map<String, Object> params = new HashMap<>();
        params.put("event_type", "E");

        Map<String, Object> result = new HashMap<>();
        result.put("eventList", foEventRepository.arraysEvent(params));
        return result;
    }

    // 이벤트 조회
    public Map<String, Object> eventView(HttpServletRequest req) {
        Map<String, Object> params = null;
        params.put("event_seq", "1");

        Map<String, Object> result = new HashMap<>();
        result.put("event", foEventRepository.selectEvent(params));
        return result;
    }
}
