
package bucoop.util;

import bucoop.model.Userbasic;
import bucoop.dto.UserbasicDto;
import bucoop.model.Userprivacy;
import bucoop.dto.UserprivacyDto;
import bucoop.dto.UseradditionalDto;
import bucoop.model.Useradditional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileUtilImpl implements ProfileUtil {
    
    @Autowired
    private UserbasicDto userBasicDto;
    
    @Autowired
    private UseradditionalDto userAdditionalDto;
    
    @Autowired
    private UserprivacyDto userPrivacyDto;
    
    @Override
    public Userbasic getProfileById(Integer userID) {
        return userBasicDto.getAppUserWithId(userID);
    }
    
    @Override
    public Useradditional getProfileAdditionalById(Integer userID) {
        return userAdditionalDto.getUserAdditionalWithId(userID);
    }
    
    @Override
    public Userprivacy getProfilePrivacyById(Integer userID) {
        return userPrivacyDto.getUserPrivacyWithId(userID);
    }
    
    @Override
    public boolean editProfileInfo(String firstname, String surname, String email, String about, Useradditional userAdditional) {

        userAdditional.setFirstname(firstname);
        userAdditional.setSurname(surname);
        userAdditional.setEmail(email);
        userAdditional.setAbout(about);
        
        userAdditionalDto.updateUserAdditional(userAdditional);
        return true;
    }
    
    @Override
    public boolean editProfilePrivacy(boolean firstnamePriv, boolean surnamePriv, boolean emailPriv, boolean aboutPriv, Userprivacy userPrivacy) {
        
        userPrivacy.setFirstnamepriv(firstnamePriv);
        userPrivacy.setSurnamepriv(surnamePriv);
        userPrivacy.setEmailpriv(emailPriv);
        userPrivacy.setEmailpriv(emailPriv);

        userPrivacyDto.updateUserPrivacy(userPrivacy);
        return true;
    }
}
