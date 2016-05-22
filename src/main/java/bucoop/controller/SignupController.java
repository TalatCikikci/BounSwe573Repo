package bucoop.controller;

import bucoop.model.Userbasic;
import bucoop.util.LoginUtil;
import bucoop.util.SignupUtil;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/signup")
public class SignupController {

    @Autowired
    private SignupUtil signupUtil;
    
    @Autowired
    private LoginUtil loginUtil;
    
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String displaySignup(Model model) {
        return "signup";
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "")
    public String signUp(@RequestParam String username,
                         @RequestParam String password,
                         Model model,
                         RedirectAttributes redirectAttributes,
                         HttpServletRequest httpServletRequest) {
        final boolean signUpAllowed
                = signupUtil.checkSignUpAllowed(username, password);

        if (!signUpAllowed) {
            // TODO: Sign up not allowed..
            // Show a meaningful message to the user.erhan
        }

        final boolean signUpSuccessful
                = signupUtil.signUp(username, password);

        if (!signUpSuccessful) {
            // TODO: Sign up not allowed..
            // Show a meaningful message to the user.
        }

        final String successMessage = "Successfully signed up!";
        final Userbasic userBasic = loginUtil.getAppUserWithMail(username);

        httpServletRequest.getSession().setAttribute("sessionUser", username);
        httpServletRequest.getSession().setAttribute("sessionUserAsBean", userBasic);

        redirectAttributes.addFlashAttribute("successMessage", successMessage);
        redirectAttributes.addFlashAttribute("sessionUser", username);
        redirectAttributes.addFlashAttribute("sessionUserAsBean", userBasic);
        return "redirect:/";
    }
}
