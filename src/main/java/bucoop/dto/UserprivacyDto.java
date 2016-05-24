package bucoop.dto;

import bucoop.model.Userprivacy;


public interface UserprivacyDto {
    
    void persistUserAdditionalInfo(Userprivacy userAdditional);
    
    Userprivacy getUserAdditionalWithId(long userId);
}
