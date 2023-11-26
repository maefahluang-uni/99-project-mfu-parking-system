package th.mfu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import th.mfu.Service.VisitorService;

@Controller
@RequestMapping("/login")
public class LoginController {

    public LoginController(VisitorService visitorservice) {
    }

    @GetMapping
    public String showLoginForm() {
        return "login";
    }

    
}