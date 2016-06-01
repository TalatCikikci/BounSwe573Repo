package bucoop.dto;

import bucoop.model.Announcement;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AnnouncementDtoImpl implements AnnouncementDto{
    
    @PersistenceContext
    private EntityManager entityManager;

    
    @Override
    @Transactional
    public void persistAnnouncement(Announcement announcement) {
        entityManager.persist(announcement);
    }
    
    
    @Override
    public Announcement getAnnouncementWithId(Integer announcementId) {
        final Announcement announcement = entityManager.find(Announcement.class, announcementId);
        if (announcement == null) {
            return null;
        }
        return announcement;
    }
    
    
    @Override
    public List<Announcement> getAnnouncements() {
        final List announcementsOrdered = entityManager.createQuery("SELECT h FROM Announcement h ORDER BY h.id ASC").getResultList();
        return announcementsOrdered;
    }

    
    @Override
    public List<Announcement> getAnnouncementList() {
        final List<Announcement> announcementList = getAnnouncements();
        return announcementList;
    }
    
    @Override
    public List<Announcement> getAnnouncementListByTitle(String announcementTitle) {
        final List<Announcement> announcementList = entityManager.createQuery("SELECT h FROM Announcement h WHERE h.announcementtitle = :announcementtitle").setParameter("announcementtitle", "%" + announcementTitle + "%").getResultList();
        return announcementList;
    }
    
    @Override
    public List<Announcement> getAnnouncementListByBody(String announcementBody) {
        final List<Announcement> announcementList = entityManager.createQuery("SELECT h FROM Announcement h WHERE h.announcementbody = :announcementbody").setParameter("announcementbody", "%" + announcementBody + "%").getResultList();
        return announcementList;
    }
}
