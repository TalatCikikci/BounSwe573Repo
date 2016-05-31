package bucoop.dto;

import bucoop.model.Producer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ProducerDtoImpl implements ProducerDto{
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void persistProducer(Producer producer) {
        entityManager.persist(producer);
    }
    
    @Override
    public Producer getProducerWithId(Integer producerId) {
        final Producer producer = entityManager.find(Producer.class, producerId);
        if (producer == null) {
            return null;
        }
        return producer;
    }
    
    @Override
    public List<Producer> getProducers() {
        final List producersOrdered = entityManager.createQuery("SELECT h FROM Producer h ORDER BY h.id ASC").getResultList();
        return producersOrdered;
    }

    
    @Override
    public List<Producer> getProducerList() {
        final List<Producer> producerList = getProducers();
        return producerList;
    }
}
