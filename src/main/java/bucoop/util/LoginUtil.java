package bucoop.util;

import bucoop.model.Userbasic;

public interface LoginUtil {
    
    boolean logIn(String username, String password);

    Userbasic getAppUserWithName(String username);
    
}
