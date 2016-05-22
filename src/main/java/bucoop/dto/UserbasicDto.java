package bucoop.dto;

import bucoop.model.Userbasic;

public interface UserbasicDto {
    
    void persistUserBasicInfo(Userbasic userBasic);
    
    boolean userExistsWithMail(String username, String password);

    Userbasic getAppUserWithMail(String username);

    Userbasic getAppUserWithId(long userId);

    void setType(String username , String userType);
}
