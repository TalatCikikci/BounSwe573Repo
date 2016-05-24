package bucoop.util;

public interface SignupUtil {
    
    boolean signUp(String username, String email, String password);
    
    boolean checkSignUpAllowed(String username, String password);
    
}
