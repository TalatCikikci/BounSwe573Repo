package bucoop.util;

import bucoop.model.Useradditional;
import bucoop.model.Userbasic;
import bucoop.model.Userprivacy;
import java.util.List;

public interface ProfileUtil {
    
    boolean editProfileInfo(String firstname, String surname, String email, String about, Useradditional userAdditional);
    
    boolean editProfilePrivacy(boolean firstnamePriv, boolean surnamePriv, boolean emailPriv, boolean aboutPriv, Userprivacy userPrivacy);
    
    Userbasic getProfileById(Integer userID);
    
    Useradditional getProfileAdditionalById(Integer userID);
    
    Userprivacy getProfilePrivacyById(Integer userID);
    
    List<Userbasic> getBasicUsersList();
    
}
