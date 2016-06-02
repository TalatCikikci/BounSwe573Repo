package bucoop.dto;

import bucoop.model.Userprivacy;
import java.util.List;
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
    @Transactional
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
    
    @Override
    @Transactional
    public List<Userprivacy> getPrivacyUsers() {
        final List userPrivacyOrdered = entityManager.createQuery("SELECT h FROM Userprivacy h ORDER BY h.id ASC").getResultList();
        return userPrivacyOrdered;
    }
    
    @Override
    public List<Userprivacy> getPrivacyUsersList() {
        final List<Userprivacy> privacyUsersList = getPrivacyUsers();
        return privacyUsersList;
    }
}
