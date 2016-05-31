package bucoop.util;

import bucoop.dto.AnnouncementDto;
import bucoop.model.Announcement;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnouncementUtilImpl implements AnnouncementUtil {
    
    @Autowired
    private AnnouncementDto announcementDto;
    
    @Override
    public boolean addAnnouncement(String announcementtitle, String announcementbody){
        final Announcement announcement = new Announcement();
        announcement.setAnnouncementtitle(announcementtitle);
        announcement.setAnnouncementbody(announcementbody);
        announcementDto.persistAnnouncement(announcement);
        return true;
    }
    
    
    @Override
    public boolean deleteAnnouncement(Integer announcementID){
        return true;
    }
    
    
    @Override
    public List<Announcement> getAnnouncementList(){
        final List<Announcement> announcementCollection = announcementDto.getAnnouncementList();
        return announcementCollection;
    }
    
    
    @Override
    public Announcement getAnnouncementById(Integer announcementID) {
        Announcement announcementtitle = announcementDto.getAnnouncementWithId(announcementID);
        return announcementtitle;
    }
}
