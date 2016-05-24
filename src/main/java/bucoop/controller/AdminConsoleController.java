package bucoop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminConsoleController {

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
    
    @RequestMapping(value = "/addproducer", method = RequestMethod.POST)
    public String addProduceradmin(Model model) {
        return "redirect:produceradmin";
    }
    
    @RequestMapping(value = "/addannouncement", method = RequestMethod.POST)
    public String addAnnouncementadmin(Model model) {
        return "redirect:announcementadmin";
    }
}
