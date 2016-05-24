package bucoop.dto;

import bucoop.model.Useradditional;


public interface UseradditionalDto {
    
    void persistUserAdditionalInfo(Useradditional userAdditional);
    
    Useradditional getUserAdditionalWithId(long userId);
    
}
