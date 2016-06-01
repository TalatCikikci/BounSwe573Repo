package bucoop.dto;

import bucoop.model.Announcement;
import java.util.List;


public interface AnnouncementDto {
    
    public void persistAnnouncement(Announcement announcement);
    
    public Announcement getAnnouncementWithId(Integer announcementId);
    
    public List<Announcement> getAnnouncements();
    
    public List<Announcement> getAnnouncementList();
    
    public List<Announcement> getAnnouncementListByTitle(String announcementTitle);
    
    public List<Announcement> getAnnouncementListByBody(String announcementBody);    
}
