package os_group_3;

import java.security.NoSuchAlgorithmException;

public class OS_Group_3 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        db_connect.connect_db();
        
        LoginForm loginform = new LoginForm();
        loginform.show();
    }
}
 