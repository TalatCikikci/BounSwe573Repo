package bucoop.controller;

import bucoop.model.Announcement;
import bucoop.model.Category;
import bucoop.model.Producer;
import bucoop.model.Product;
import bucoop.model.Productall;
import bucoop.model.Useradditional;
import bucoop.model.Userbasic;
import bucoop.util.AnnouncementUtil;
import bucoop.util.ProducerUtil;
import bucoop.util.ProductUtil;
import bucoop.util.ProfileUtil;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping(value = "/search")
public class SearchController {

    @Autowired
    private ProductUtil productUtil;
    
    @Autowired
    private ProfileUtil profileUtil;
    
    @Autowired
    private AnnouncementUtil announcementUtil;
    
    @Autowired
    private ProducerUtil producerUtil;
    
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String displayHome(Model model) {
        return "searchresults";
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "")
    public String logIn(@RequestParam String searchitem,
                        Model model,
                        RedirectAttributes redirectAttributes,
                        HttpServletRequest httpServletRequest) {

//        final List<Userbasic> userbasicList = profileUtil.getBasicUsersListByItem(searchitem);
//        final List<Useradditional> useradditionalList = profileUtil.getAdditionalUsersListByItem(searchitem);
        final List<Producer> producerList = producerUtil.getProducerListByItem(searchitem);
//        final List<Category> categoryList = productUtil.getCategoryListByItem(searchitem);
//        final List<Product> productList = productUtil.getProductListByItem(searchitem);
//        final List<Announcement> announcementList = announcementUtil.getAnnouncementListByItem(searchitem);
        final List<Productall> productAllList = productUtil.getProductInfoByKeyword(searchitem);
        
        
//        httpServletRequest.getSession().setAttribute("announcementList", announcementList);
//        httpServletRequest.getSession().setAttribute("categoryList", categoryList);
        httpServletRequest.getSession().setAttribute("producerList", producerList);
//        httpServletRequest.getSession().setAttribute("userbasicList", userbasicList);
//        httpServletRequest.getSession().setAttribute("useradditionalList", useradditionalList);
        httpServletRequest.getSession().setAttribute("productList", productAllList);
        
        return "searchresults";
    }
}
