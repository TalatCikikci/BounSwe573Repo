package bucoop.dto;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import bucoop.model.Useradditional;
import java.util.List;

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
    @Transactional
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
    
    @Override
    @Transactional
    public List<Useradditional> getAdditionalUsers() {
        final List userAdditionalOrdered = entityManager.createQuery("SELECT h FROM Useradditional h ORDER BY h.id ASC").getResultList();
        return userAdditionalOrdered;
    }
    
    @Override
    public List<Useradditional> getAdditionalUsersList() {
        final List<Useradditional> additionalUsersList = getAdditionalUsers();
        return additionalUsersList;
    }
    
    @Override
    @Transactional
    public List<Useradditional> getUseradditionalByFirstname(String firstname) {
        final List useradditionalWithName = entityManager.createQuery("SELECT h FROM Useradditional h WHERE h.firstname = :firstname")
                .setParameter("firstname", firstname).getResultList();
        return useradditionalWithName;
    }
    
    @Override
    @Transactional
    public List<Useradditional> getUseradditionalBySurname(String surname) {
        final List useradditionalWithDescription = entityManager.createQuery("SELECT h FROM Useradditional h WHERE h.surname = :surname")
                .setParameter("surname", surname).getResultList();
        return useradditionalWithDescription;
    }
    
    @Override
    @Transactional
    public List<Useradditional> getUseradditionalByAbout(String about) {
        final List useradditionalWithLocation = entityManager.createQuery("SELECT h FROM Useradditional h WHERE h.about = :about")
                .setParameter("about", about).getResultList();
        return useradditionalWithLocation;
    }
    
    @Override
    @Transactional
    public List<Useradditional> getUseradditionalByEmail(String email) {
        final List useradditionalWithEmail = entityManager.createQuery("SELECT h FROM Useradditional h WHERE h.email = :email")
                .setParameter("email", email).getResultList();
        return useradditionalWithEmail;
    }
}
