package bucoop.controller;


import bucoop.model.Announcement;
import bucoop.model.Productall;
import bucoop.util.AnnouncementUtil;
import bucoop.util.ProductUtil;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping(value = "")
public class HomeController {

    @Autowired
    private AnnouncementUtil announcementUtil;
    
    @Autowired
    private ProductUtil productUtil;
    
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String displayHome(Model model,
                              RedirectAttributes redirectAttributes,
                              HttpServletRequest httpServletRequest) {
        
        final List<Announcement> announcementList = announcementUtil.getAnnouncementList();
        final List<Productall> productList = productUtil.getProductalls();
        
        httpServletRequest.getSession().setAttribute("announcementList", announcementList);
        httpServletRequest.getSession().setAttribute("productList", productList);
        
        return "home";
    }
}