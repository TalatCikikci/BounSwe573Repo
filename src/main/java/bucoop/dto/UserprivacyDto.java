package bucoop.dto;

import bucoop.model.Userprivacy;
import java.util.List;


public interface UserprivacyDto {
    
    void persistUserPrivacyInfo(Userprivacy userAdditional);
    
    Userprivacy getUserPrivacyWithId(Integer userId);
    
    void updateUserPrivacy(Userprivacy userPrivacy);
    
    public List<Userprivacy> getPrivacyUsers();
    
    public List<Userprivacy> getPrivacyUsersList();
}
