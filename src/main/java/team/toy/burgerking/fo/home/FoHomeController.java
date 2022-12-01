package team.toy.burgerking.fo.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/fo/home")
@Controller
@CrossOrigin(origins = "*")
public class FoHomeController {

    @Autowired
    private FoHomeService foHomeService;

    @ResponseBody
    @PostMapping("/home.ajax")
    public Map<String, Object> homeListAjax(HttpServletRequest req){
        return foHomeService.homeList(req);
    }
}
