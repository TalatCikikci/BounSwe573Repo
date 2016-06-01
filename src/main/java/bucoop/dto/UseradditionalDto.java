package bucoop.dto;

import bucoop.model.Useradditional;
import java.util.List;


public interface UseradditionalDto {
    
    void persistUserAdditionalInfo(Useradditional userAdditional);
    
    Useradditional getUserAdditionalWithId(Integer userId);
    
    void updateUserAdditional(Useradditional userAdditional);
    
    public List<Useradditional> getAdditionalUsers();
    
    public List<Useradditional> getAdditionalUsersList();
    
    public List<Useradditional> getUseradditionalByFirstname(String firstname);
    
    public List<Useradditional> getUseradditionalBySurname(String surname);
    
    public List<Useradditional> getUseradditionalByAbout(String about);
    
    public List<Useradditional> getUseradditionalByEmail(String email);
}
