package bucoop.util;

import bucoop.dto.ProducerDto;
import bucoop.model.Producer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProducerUtilImpl implements ProducerUtil{
        
    @Autowired
    private ProducerDto producerDto;
    
    @Override
    public boolean addProducer(String producername, String producerdesc, String location){
        final Producer producer = new Producer();
        producer.setProducername(producername);
        producer.setProducerdesc(producerdesc);
        producerDto.persistProducer(producer);
        return true;
    }
    
    
    @Override
    public boolean deleteProducer(Integer producerID){
        return true;
    }
    
    
    @Override
    public List<Producer> getProducerList(){
        final List<Producer> producerCollection = producerDto.getProducerList();
        return producerCollection;
    }
    
    
    @Override
    public Producer getProducerById(Integer producerID) {
        Producer producertitle = producerDto.getProducerWithId(producerID);
        return producertitle;
    }
}
