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

        if (username.isEmpty()) {
            final String successMessage = "Username cannot be empty!";
            redirectAttributes.addFlashAttribute("successMessage", successMessage);
            return "redirect:/login";
        }
        
        if (password.isEmpty()) {
            final String successMessage = "Password cannot be empty!";
            redirectAttributes.addFlashAttribute("successMessage", successMessage);
            return "redirect:/login";
        }
        
        final boolean loginSuccessful = loginUtil.logIn(username, password);

        if (!loginSuccessful) {
            final String successMessage = "Username - password combination not found. Either the user does not exist or the password is incorrect.";
            redirectAttributes.addFlashAttribute("successMessage", successMessage);
            return "redirect:/login";
        }

        final Userbasic userbasic = loginUtil.getAppUserWithName(username);
        final Integer userId = userbasic.getId();
        final String userType = userbasic.getType();
        final boolean userActive = userbasic.getActive();
        
        if (userActive == false) {
            final String successMessage = "User has been banned!";
            redirectAttributes.addFlashAttribute("successMessage", successMessage);
            return "redirect:/login";
        }
            
        final String successMessage = "Successfully logged in!";
        
        redirectAttributes.addFlashAttribute("successMessage", successMessage);
        redirectAttributes.addFlashAttribute("sessionUser", username);
        redirectAttributes.addFlashAttribute("sessionUserAsBean", userbasic);

        httpServletRequest.getSession().setAttribute("sessionUser", username);
        httpServletRequest.getSession().setAttribute("sessionUserAsBean", userbasic);
        httpServletRequest.getSession().setAttribute("sessionUserId", userId);
        httpServletRequest.getSession().setAttribute("sessionUserType", userType);

        return "redirect:/";
    }
    
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest httpServletRequest,
                         RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("successMessage", "Logged out!");
        httpServletRequest.getSession().invalidate();
        return "redirect:/";
    }
}
