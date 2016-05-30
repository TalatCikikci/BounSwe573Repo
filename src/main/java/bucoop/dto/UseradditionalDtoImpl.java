package bucoop.dto;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import bucoop.model.Useradditional;

@Repository
public class UseradditionalDtoImpl implements UseradditionalDto {
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void persistUserAdditionalInfo(Useradditional userAdditional) {
        entityManager.persist(userAdditional);
    }
    
    @Override
    public Useradditional getUserAdditionalWithId(Integer userId) {
        final Useradditional userAdditional = entityManager.find(Useradditional.class, userId);
        if (userAdditional == null) {
            return null;
        }
        return userAdditional;
    }
    
    @Override
    @Transactional
    public void updateUserAdditional(Useradditional userAdditional) {
        entityManager.merge(userAdditional);
        entityManager.flush();
    }
}
