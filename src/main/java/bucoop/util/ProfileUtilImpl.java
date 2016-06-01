
package bucoop.util;

import bucoop.model.Userbasic;
import bucoop.dto.UserbasicDto;
import bucoop.model.Userprivacy;
import bucoop.dto.UserprivacyDto;
import bucoop.dto.UseradditionalDto;
import bucoop.model.Useradditional;
import java.util.ArrayList;
import java.util.List;
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
    
    @Override
    public List<Userbasic> getBasicUsersList(){
        final List<Userbasic> userBasicCollection = userBasicDto.getBasicUsersList();
        return userBasicCollection;
    }
    
    @Override
    public List<Userbasic> getBasicUsersListByItem(String searchitem){
        final List<Userbasic> userBasicCollection = userBasicDto.getUserbasicByUsername(searchitem);
        return userBasicCollection;
    }
    
    @Override
    public List<Useradditional> getAdditionalUsersList(){
        final List<Useradditional> userAdditionalCollection = userAdditionalDto.getAdditionalUsersList();
        return userAdditionalCollection;
    }
    
    @Override
    public List<Useradditional> getAdditionalUsersListByItem(String searchitem){
        final List<Useradditional> userFirstnameCollection = userAdditionalDto.getUseradditionalByFirstname(searchitem);
        final List<Useradditional> userSurnameCollection = userAdditionalDto.getUseradditionalBySurname(searchitem);
        final List<Useradditional> userAboutCollection = userAdditionalDto.getUseradditionalByAbout(searchitem);
        final List<Useradditional> userEmailCollection = userAdditionalDto.getUseradditionalByEmail(searchitem);
        
        List<Useradditional> userAdditionalCollection = new ArrayList();
        userAdditionalCollection.addAll(userFirstnameCollection);
        userAdditionalCollection.addAll(userSurnameCollection);
        userAdditionalCollection.addAll(userAboutCollection);
        userAdditionalCollection.addAll(userEmailCollection);
        
        return userAdditionalCollection;
    }
    
    @Override
    public List<Userprivacy> getPrivacyUsersList(){
        final List<Userprivacy> userPrivacyCollection = userPrivacyDto.getPrivacyUsersList();
        return userPrivacyCollection;
    }
}
