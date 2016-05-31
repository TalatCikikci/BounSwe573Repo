package bucoop.dto;

import bucoop.model.Producer;
import java.util.List;


public interface ProducerDto {
    
    public void persistProducer(Producer producer);
    
    public Producer getProducerWithId(Integer producerId);
    
    public List<Producer> getProducers();
    
    public List<Producer> getProducerList();
    
}
