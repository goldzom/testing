package another.anoboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping("/waldo")
    public String welcome(){
        return "welcome";
    }
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
