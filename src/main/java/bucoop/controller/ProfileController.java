package bucoop.controller;

import bucoop.model.Useradditional;
import bucoop.model.Userprivacy;
import bucoop.util.ProfileUtil;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProfileController {
    
    @Autowired
    private ProfileUtil profileUtil;
    
    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String displayProfile(HttpServletRequest httpServletRequest) {
        final String username = (String) httpServletRequest.getSession().getAttribute("sessionUser");
        final Integer userId = (Integer) httpServletRequest.getSession().getAttribute("sessionUserId");
        if (username == null || username.equals("")) {
            return "redirect:/";
        }
        
        Useradditional userAdditional = profileUtil.getProfileAdditionalById(userId);
        Userprivacy userPrivacy = profileUtil.getProfilePrivacyById(userId);
        
        final boolean userEmailPriv = userPrivacy.getEmailpriv();
        final boolean userFirstNamePriv = userPrivacy.getFirstnamepriv();
        final boolean userSurnamePriv = userPrivacy.getSurnamepriv();
        final boolean userAboutPriv = userPrivacy.getAboutpriv();
        final boolean userAvatarPriv = userPrivacy.getAvatarpriv();
        
        if (userEmailPriv == false) {
            final String userEmail = userAdditional.getEmail();
            httpServletRequest.getSession().setAttribute("sessionEmail", userEmail);
        }
        else {
            final String userEmail = "<PRIVATE>";
            httpServletRequest.getSession().setAttribute("sessionEmail", userEmail);
        }
        
        if (userFirstNamePriv == false) {
            final String userFirstName = userAdditional.getFirstname();
            httpServletRequest.getSession().setAttribute("sessionFirstName", userFirstName);
        }
        else {
           final String userFirstName = "<PRIVATE>";
            httpServletRequest.getSession().setAttribute("sessionFirstName", userFirstName); 
        }
        
        if (userSurnamePriv == false) {
            final String userSurname = userAdditional.getSurname();
            httpServletRequest.getSession().setAttribute("sessionSurname", userSurname);
        }
        else {
            final String userSurname = "<PRIVATE>";
            httpServletRequest.getSession().setAttribute("sessionSurname", userSurname);
        }

        if (userAboutPriv == false) {
            final String userAbout = userAdditional.getAbout();
            httpServletRequest.getSession().setAttribute("sessionAbout", userAbout);
        }
        else {
            final String userAbout = "<PRIVATE>";
            httpServletRequest.getSession().setAttribute("sessionAbout", userAbout);
        }
        
        if (userAvatarPriv == false) {
            final byte[] userAvatar = userAdditional.getAvatar();
            httpServletRequest.getSession().setAttribute("sessionAvatar", userAvatar);
        }
        else {
            final byte[] userAvatar = null;
            httpServletRequest.getSession().setAttribute("sessionAvatar", userAvatar);
        }
        
//        final String successMessage = "Successfully logged in!";
//        redirectAttributes.addFlashAttribute("successMessage", successMessage);
        
        return "profile";
    }
    
    @RequestMapping(value = "/editprofile", method = RequestMethod.GET)
    public String displayEditProfile(Model model) {
        return "editprofile";
    }
    
    @RequestMapping(value = "/editaction", method = RequestMethod.POST)
    public String editProfile(@RequestParam String firstname,
                         @RequestParam String surname,
                         @RequestParam String email,
                         @RequestParam String about,
//                         @RequestParam boolean firstnameVisible,
//                         @RequestParam boolean surnameVisible,
//                         @RequestParam boolean emailVisible,
//                         @RequestParam boolean aboutVisible,
                         Model model,
                         RedirectAttributes redirectAttributes,
                         HttpServletRequest httpServletRequest) {
        
        final Integer userId = (Integer) httpServletRequest.getSession().getAttribute("sessionUserId");
 
        Useradditional userAdditional = profileUtil.getProfileAdditionalById(userId);
//        Userprivacy userPrivacy = profileUtil.getProfilePrivacyById(userId);
        
        final boolean editInfoSuccessful = profileUtil.editProfileInfo(firstname, surname, email, about, userAdditional);
//        final boolean editPrivSuccessful = profileUtil.editProfilePrivacy(firstnameVisible, surnameVisible, emailVisible, aboutVisible, userPrivacy);
                
        if (!editInfoSuccessful) {
            final String successMessage = "Something went wrong while editing profile information!";
            redirectAttributes.addFlashAttribute("successMessage", successMessage);
            return "redirect:editprofile";
        }
        
//        if (!editPrivSuccessful) {
//            final String successMessage = "Something went wrong while editing profile privacy!";
//            redirectAttributes.addFlashAttribute("successMessage", successMessage);
//            return "redirect:editprofile";
//        }
        
        return "redirect:profile";
    }
}
