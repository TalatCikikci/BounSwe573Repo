package bucoop.util;

import bucoop.dto.UseradditionalDto;
import bucoop.dto.UserprivacyDto;
import bucoop.model.Userbasic;
import bucoop.dto.UserbasicDto;
import bucoop.model.Useradditional;
import bucoop.model.Userprivacy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignupUtilImpl implements SignupUtil {

    @Autowired
    private UserbasicDto userBasicDto;
    
    @Autowired
    private UseradditionalDto userAdditionalDto;
        
    @Autowired
    private UserprivacyDto userPrivacyDto;

    @Override
    public boolean checkSignUpAllowed(String username, String password) {
        if (username.isEmpty()){
            return false;
        }
        else if (password.isEmpty()){
            return false;
        }

        return true;
    }

    @Override
    public boolean signUp(String username, String email, String password) {
        final Userbasic userBasic = new Userbasic();
        final Useradditional userAdditional = new Useradditional();
        final Userprivacy userPrivacy = new Userprivacy();
        userBasic.setUsername(username);
        userBasic.setPassword(password);
        userBasic.setType("basic");
        userBasic.setActive(true);
        userBasicDto.persistUserBasicInfo(userBasic);
        int userID = userBasicDto.getAppUserWithName(username).getId();
        userAdditional.setId(userID);
        userAdditional.setEmail(email);
        userAdditionalDto.persistUserAdditionalInfo(userAdditional);
        userPrivacy.setId(userID);
        userPrivacyDto.persistUserPrivacyInfo(userPrivacy);
        return true;
    }
}