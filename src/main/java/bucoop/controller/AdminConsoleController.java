package bucoop.controller;

import bucoop.dto.CategoryDto;
import bucoop.model.Category;
import bucoop.util.ProductUtil;
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
    private CategoryDto categoryDto;
    
    @RequestMapping(value = "/adminconsole", method = RequestMethod.GET)
    public String displayConsole(Model model) {
        return "adminconsole";
    }
    
    @RequestMapping(value = "/useradmin", method = RequestMethod.GET)
    public String displayUseradmin(Model model) {
        return "useradmin";
    }
    
    @RequestMapping(value = "/requestadmin", method = RequestMethod.GET)
    public String displayRequestadmin(Model model) {
        return "requestadmin";
    }
    
    @RequestMapping(value = "/productadmin", method = RequestMethod.GET)
    public String displayProductadmin(Model model) {
        return "productadmin";
    }
    
    @RequestMapping(value = "/addproduct", method = RequestMethod.GET)
    public String displayAddProductadmin(Model model) {
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
    public String displayProduceradmin(Model model) {
        return "produceradmin";
    }
    
    @RequestMapping(value = "/addproducer", method = RequestMethod.GET)
    public String displayAddProduceradmin(Model model) {
        return "addproducer";
    }
    
    @RequestMapping(value = "/announcementadmin", method = RequestMethod.GET)
    public String displayAnnouncementadmin(Model model) {
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
    public String addProductadmin(Model model) {
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
    public String addProduceradmin(Model model) {
        return "redirect:produceradmin";
    }
    
    @RequestMapping(value = "/addannouncement", method = RequestMethod.POST)
    public String addAnnouncementadmin(Model model) {
        return "redirect:announcementadmin";
    }
}
