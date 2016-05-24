
package bucoop.util;

import bucoop.dto.UseradditionalDto;
import bucoop.model.Useradditional;
import org.springframework.beans.factory.annotation.Autowired;


public class ProfileUtilImpl implements ProfileUtil {
    
    @Autowired
    private UseradditionalDto userAdditionalDto;
    
    @Override
    public boolean editProfile(String firstname, String lastname, String email, String about) {
        final Useradditional userAdditional = new Useradditional();

        userAdditional.setFirstname(firstname);
        userAdditional.setSurname(lastname);
        userAdditional.setEmail(email);
        userAdditional.setAbout(about);
        userAdditionalDto.persistUserAdditionalInfo(userAdditional);
        return true;
    }
}
