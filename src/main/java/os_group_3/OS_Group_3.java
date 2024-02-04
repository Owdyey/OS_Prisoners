package os_group_3;

public class OS_Group_3 {

    public static void main(String[] args) {
        db_connect.connect_db();
        
        LoginForm loginform = new LoginForm();
        loginform.show();
    }
}
 