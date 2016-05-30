package bucoop.dto;

import bucoop.model.Userbasic;
import java.util.List;

public interface UserbasicDto {
    
    void persistUserBasicInfo(Userbasic userBasic);
    
    boolean userExistsWithName(String username, String password);

    Userbasic getAppUserWithName(String username);

    Userbasic getAppUserWithId(Integer userId);

    void setType(String username , String userType);
    
    void updateUserBasic(Userbasic userBasic);
    
    public List<Userbasic> getBasicUsers();
    
    public List<Userbasic> getBasicUsersList();
}
