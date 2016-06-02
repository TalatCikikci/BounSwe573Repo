package bucoop.controller;

import bucoop.dto.ProducerDto;
import bucoop.model.Producer;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(value = "/producer")
public class ProducerController {
    
    @Autowired
    private ProducerDto producerDto;
    
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String displayProducerHome(Model model) {
        return "producer";
    }
    
    @RequestMapping(value = "/{producerId}", method = RequestMethod.GET)
    public String displayProducer(@PathVariable Integer producerId,
                              Model model, 
                              RedirectAttributes redirectAttributes,
                              HttpServletRequest httpServletRequest) {
        
        final Producer producer = producerDto.getProducerWithId(producerId);
                
        httpServletRequest.getSession().setAttribute("producerPage", producer);        
        
        return "producer";
    }
}
