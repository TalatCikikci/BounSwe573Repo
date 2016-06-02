package bucoop.util;

import bucoop.model.Userbasic;
import bucoop.dto.UserbasicDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginUtilImpl implements LoginUtil {
    
    @Autowired
    private UserbasicDto userBasicDto;
    
    @Override
    public boolean logIn(String username, String password) {
        boolean userCheck = userBasicDto.userExistsWithName(username, password);
        return userCheck;
    }

    @Override
    public Userbasic getAppUserWithName(String username) {
        return userBasicDto.getAppUserWithName(username);
    }
    
}
