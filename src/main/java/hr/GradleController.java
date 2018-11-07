package hr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GradleController {
    @RequestMapping("")
    public String index() {
        return "index";
    }
}
