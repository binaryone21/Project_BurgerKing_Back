package team.toy.burgerking.fo.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Service
public class FoHomeService {

    @Autowired
    private FoHomeRepository foHomeRepository;

    public Map<String,Object> homeList(HttpServletRequest req){
        Map<String, Object> result = new HashMap<>();
        result.put("homeList", foHomeRepository.arraysHome());
        return result;
    }
}
