package bucoop.dto;

import bucoop.model.Userprivacy;


public interface UserprivacyDto {
    
    void persistUserPrivacyInfo(Userprivacy userAdditional);
    
    Userprivacy getUserPrivacyWithId(Integer userId);
    
    void updateUserPrivacy(Userprivacy userPrivacy);
}
