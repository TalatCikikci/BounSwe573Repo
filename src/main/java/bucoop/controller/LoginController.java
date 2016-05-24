package bucoop.controller;


import bucoop.model.Userbasic;
import bucoop.util.LoginUtil;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping(value = "/login")
public class LoginController {
    
    @Autowired
    private LoginUtil loginUtil;  
    
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String displayLogin(Model model) {
        return "login";
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "")
    public String logIn(@RequestParam String username,
                        @RequestParam String password,
                        Model model,
                        RedirectAttributes redirectAttributes,
                        HttpServletRequest httpServletRequest) {

        final boolean loginSuccessful
                = loginUtil.logIn(username, password);

//        if (!loginSuccessful) {
//            // TODO: Login was not successful! We must inform the user!
//        }

        final String successMessage = "Successfully logged in!";
        final Userbasic userbasic = loginUtil.getAppUserWithName(username);

        redirectAttributes.addFlashAttribute("successMessage", successMessage);
        redirectAttributes.addFlashAttribute("sessionUser", username);
        redirectAttributes.addFlashAttribute("sessionUserAsBean", userbasic);

        httpServletRequest.getSession().setAttribute("sessionUser", username);
        httpServletRequest.getSession().setAttribute("sessionUserAsBean", userbasic);

        return "redirect:/";
    }
}
