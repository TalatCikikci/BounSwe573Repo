package bucoop.util;

import bucoop.model.Userbasic;
import bucoop.dto.UserbasicDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignupUtilImpl implements SignupUtil {

    @Autowired
    private UserbasicDto userBasicDto;

    @Override
    public boolean checkSignUpAllowed(String username, String password) {
        if (username == null){
            return false;
        }
        else if (password == null){
            return false;
        }

        return true;
    }

    @Override
    public boolean signUp(String username, String password) {
        final Userbasic userBasic = new Userbasic();
        userBasic.setUsername(username);
        userBasic.setPassword(password);
        userBasicDto.persistUserBasicInfo(userBasic);
        return true;
    }
}