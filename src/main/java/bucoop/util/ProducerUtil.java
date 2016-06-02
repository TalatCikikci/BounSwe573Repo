package bucoop.util;

import bucoop.model.Producer;
import java.util.List;


public interface ProducerUtil {
    
    boolean addProducer(String producername, String producerdesc, String location, Boolean isactive);
    
    boolean deleteProducer(Integer producerID);
    
    Producer getProducerById(Integer producerID);
    
    List<Producer> getProducerList();
    
    List<Producer> getProducerListByItem(String searchitem);
}
