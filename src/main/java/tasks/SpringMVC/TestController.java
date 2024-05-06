package tasks.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
    @GetMapping("/test")
    public ModelAndView testMethod(){
        ModelAndView result = new ModelAndView("testPage");
        return result;
    }
}
