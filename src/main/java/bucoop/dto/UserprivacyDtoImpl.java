package bucoop.dto;

import bucoop.model.Userprivacy;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class UserprivacyDtoImpl implements UserprivacyDto {
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void persistUserPrivacyInfo(Userprivacy userPrivacy) {
        entityManager.persist(userPrivacy);
    }
    
    @Override
    public Userprivacy getUserPrivacyWithId(Integer userId) {
        final Userprivacy userPrivacy = entityManager.find(Userprivacy.class, userId);
        if (userPrivacy == null) {
            return null;
        }
        return userPrivacy;
    }
    
    @Override
    @Transactional
    public void updateUserPrivacy(Userprivacy userPrivacy) {
        entityManager.merge(userPrivacy);
        entityManager.flush();
    }
}
