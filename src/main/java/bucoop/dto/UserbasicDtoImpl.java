package bucoop.dto;

import bucoop.model.Userbasic;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;


@Repository
public class UserbasicDtoImpl implements UserbasicDto {
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void persistUserBasicInfo(Userbasic userBasic) {
        entityManager.persist(userBasic);
    }

    @Override
    public boolean userExistsWithMail(String username, String password) {
        Userbasic userBasic = new Userbasic();
        userBasic.setUsername(username);
        userBasic.setPassword(password);
        Userbasic persistedAppUser = (Userbasic) entityManager.createQuery("SELECT a FROM Userbasic a WHERE a.username = :username AND a.password = :password")
                .setParameter("username", username)
                .setParameter("password", password)
                .setMaxResults(1)
                .getSingleResult();
        if (persistedAppUser == null) {
            return false;
        }
        return true;
    }

    @Override
    public Userbasic getAppUserWithMail(String username) {
        Userbasic userBasic = new Userbasic();
        userBasic.setUsername(username);
        Userbasic persistedAppUser = (Userbasic) entityManager.createQuery("SELECT a FROM Userbasic a WHERE a.username = :username")
                .setParameter("username", username)
                .setMaxResults(1)
                .getSingleResult();
        if (persistedAppUser == null) {
            return null;
        }
        return persistedAppUser;
    }

    @Override
    public Userbasic getAppUserWithId(long userId) {
        final Userbasic userBasic = entityManager.find(Userbasic.class, userId);
        if (userBasic == null) {
            return null;
        }
        return userBasic;
    }

    @Override
    @Transactional
   public  void setType(String username , String userType) {
        final Userbasic userBasic = getAppUserWithMail(username);
        entityManager.merge(userBasic);
        userBasic.setType(userType);
        entityManager.flush();
    }
}
