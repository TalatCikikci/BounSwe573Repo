package bucoop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProfileController {
    
    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String displayProfile(Model model) {
        return "profile";
    }
    
    @RequestMapping(value = "/editprofile", method = RequestMethod.GET)
    public String displayEditProfile(Model model) {
        return "editprofile";
    }
    
    @RequestMapping(value = "/editaction", method = RequestMethod.POST)
    public String editProfile(Model model) {
        return "profile";
    }
}
