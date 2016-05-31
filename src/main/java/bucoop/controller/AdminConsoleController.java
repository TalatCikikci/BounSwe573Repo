package bucoop.controller;

import bucoop.dto.CategoryDto;
import bucoop.model.Announcement;
import bucoop.model.Category;
import bucoop.model.Producer;
import bucoop.model.Product;
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
public class AdminConsoleController {

    @Autowired
    private ProductUtil productUtil;
    
    @Autowired
    private ProfileUtil profileUtil;
    
    @Autowired
    private AnnouncementUtil announcementUtil;
    
    @Autowired
    private ProducerUtil producerUtil;
    
    @RequestMapping(value = "/adminconsole", method = RequestMethod.GET)
    public String displayConsole(Model model) {
        return "adminconsole";
    }
    
    @RequestMapping(value = "/useradmin", method = RequestMethod.GET)
    public String displayUseradmin(HttpServletRequest httpServletRequest) {
        final List<Userbasic> userList = profileUtil.getBasicUsersList();
        httpServletRequest.getSession().setAttribute("userList", userList);
        return "useradmin";
    }
    
    @RequestMapping(value = "/requestadmin", method = RequestMethod.GET)
    public String displayRequestadmin(Model model) {
        return "requestadmin";
    }
    
    @RequestMapping(value = "/productadmin", method = RequestMethod.GET)
    public String displayProductadmin(HttpServletRequest httpServletRequest) {
        final List<Product> productList = productUtil.getProductList();
        httpServletRequest.getSession().setAttribute("productList", productList);
        return "productadmin";
    }
    
    @RequestMapping(value = "/addproduct", method = RequestMethod.GET)
    public String displayAddProductadmin(HttpServletRequest httpServletRequest) {
        
        final List<Producer> producerList = producerUtil.getProducerList();
        final List<Category> categoryList = productUtil.getCategoryList();
        
        httpServletRequest.getSession().setAttribute("categoryList", categoryList);
        httpServletRequest.getSession().setAttribute("producerList", producerList);
        
        return "addproduct";
    }
    
    @RequestMapping(value = "/categoryadmin", method = RequestMethod.GET)
    public String displayCategoryadmin(HttpServletRequest httpServletRequest) {
        final List<Category> categoryList = productUtil.getCategoryList();
        httpServletRequest.getSession().setAttribute("categoryList", categoryList);
        return "categoryadmin";
    }
    
    @RequestMapping(value = "/addcategory", method = RequestMethod.GET)
    public String displayAddCategoryadmin(Model model) {
        return "addcategory";
    }
    
    @RequestMapping(value = "/produceradmin", method = RequestMethod.GET)
    public String displayProduceradmin(HttpServletRequest httpServletRequest) {
        final List<Producer> producerList = producerUtil.getProducerList();
        httpServletRequest.getSession().setAttribute("producerList", producerList);
        return "produceradmin";
    }
    
    @RequestMapping(value = "/addproducer", method = RequestMethod.GET)
    public String displayAddProduceradmin(Model model) {
        return "addproducer";
    }
    
    @RequestMapping(value = "/announcementadmin", method = RequestMethod.GET)
    public String displayAnnouncementadmin(HttpServletRequest httpServletRequest) {
        final List<Announcement> announcementList = announcementUtil.getAnnouncementList();
        httpServletRequest.getSession().setAttribute("announcementList", announcementList);
        return "announcementadmin";
    }
    
    @RequestMapping(value = "/addannouncement", method = RequestMethod.GET)
    public String displayAddAnnouncementadmin(Model model) {
        return "addannouncement";
    }
    
    @RequestMapping(value = "/requestadmin", method = RequestMethod.POST)
    public String confirmRequestadmin(Model model) {
        return "redirect:useradmin";
    }
    
    @RequestMapping(value = "/addproduct", method = RequestMethod.POST)
    public String addProductadmin(@RequestParam String productname,
                                    String productdesc,
                                    Integer producer,
                                    Integer category,
                                    Model model,
                                    RedirectAttributes redirectAttributes,
                                    HttpServletRequest httpServletRequest) {
        
        final boolean productAdded = productUtil.addProduct(productname, productdesc, producer, category);
        
        if (!productAdded) {
            final String successMessage = "Product could not be added!";
            redirectAttributes.addFlashAttribute("successMessage", successMessage);
            return "redirect:addproduct";
        }
        
        final String successMessage = "Product created!";
        redirectAttributes.addFlashAttribute("successMessage", successMessage);
        return "redirect:productadmin";
    }
    
    @RequestMapping(value = "/addcategory", method = RequestMethod.POST)
    public String addCategoryadmin(@RequestParam String categoryname, 
                                    Model model,
                                    RedirectAttributes redirectAttributes,
                                    HttpServletRequest httpServletRequest) {
        
        final boolean categoryAdded = productUtil.addCategory(categoryname);
        
        if (!categoryAdded) {
            final String successMessage = "Category could not be added!";
            redirectAttributes.addFlashAttribute("successMessage", successMessage);
            return "redirect:addcategory";
        }
        
        final String successMessage = "Category created!";
        redirectAttributes.addFlashAttribute("successMessage", successMessage);
        
        return "redirect:categoryadmin";
    }
    
    @RequestMapping(value = "/addproducer", method = RequestMethod.POST)
    public String addProduceradmin(@RequestParam String producername,
                                    String producerdesc,
                                    String location,
                                    Model model,
                                    RedirectAttributes redirectAttributes,
                                    HttpServletRequest httpServletRequest) {
        
        final boolean producerAdded = producerUtil.addProducer(producername, producerdesc, location);
        
        if (!producerAdded) {
            final String successMessage = "Producer could not be added!";
            redirectAttributes.addFlashAttribute("successMessage", successMessage);
            return "redirect:addproducer";
        }
        
        final String successMessage = "Producer created!";
        redirectAttributes.addFlashAttribute("successMessage", successMessage);
        
        return "redirect:produceradmin";
    }
    
    @RequestMapping(value = "/addannouncement", method = RequestMethod.POST)
    public String addAnnouncementadmin(@RequestParam String announcementtitle,
                                    String announcementbody,
                                    Model model,
                                    RedirectAttributes redirectAttributes,
                                    HttpServletRequest httpServletRequest) {
        
        final boolean announcementAdded = announcementUtil.addAnnouncement(announcementtitle, announcementbody);
        
        if (!announcementAdded) {
            final String successMessage = "Announcement could not be added!";
            redirectAttributes.addFlashAttribute("successMessage", successMessage);
            return "redirect:addannouncement";
        }
        
        final String successMessage = "Announcement created!";
        redirectAttributes.addFlashAttribute("successMessage", successMessage);
        
        return "redirect:announcementadmin";
    }
}
