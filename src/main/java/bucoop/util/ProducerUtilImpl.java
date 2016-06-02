package bucoop.util;

import bucoop.dto.ProducerDto;
import bucoop.model.Producer;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProducerUtilImpl implements ProducerUtil{
        
    @Autowired
    private ProducerDto producerDto;
    
    @Override
    public boolean addProducer(String producername, String producerdesc, String location, Boolean isactive){
        final Producer producer = new Producer();
        producer.setProducername(producername);
        producer.setProducerdesc(producerdesc);
        producer.setActive(isactive);
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
    
    @Override
    public List<Producer> getProducerListByItem(String searchitem){
        final List<Producer> producerNameCollection = producerDto.getProducerByName(searchitem);
        final List<Producer> producerDescCollection = producerDto.getProducerByDescription(searchitem);
        final List<Producer> producerLocationCollection = producerDto.getProducerByLocation(searchitem);
        
        List<Producer> producerResultList = new ArrayList();
        producerResultList.addAll(producerNameCollection);
        producerResultList.addAll(producerDescCollection);
        producerResultList.addAll(producerLocationCollection);
        
        return producerResultList;
    }
}
