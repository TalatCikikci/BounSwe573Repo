package bucoop.controller;

import bucoop.dto.ProductDto;
import bucoop.model.Productall;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
    
    @Autowired
    private ProductDto productDto;
    
//    @RequestMapping(value = "", method = RequestMethod.GET)
//    public String displayProductHome(Model model) {
//        return "product";
//    }
//    
    @RequestMapping(value = "/{productId}", method = RequestMethod.GET)
    public String displayProduct(@PathVariable Integer productId,
                              Model model, 
                              RedirectAttributes redirectAttributes,
                              HttpServletRequest httpServletRequest) {
        
        final Productall product = productDto.getAllProductInfo(productId);
                
        httpServletRequest.getSession().setAttribute("productPage", product);        
        
        return "product";
    }
}
