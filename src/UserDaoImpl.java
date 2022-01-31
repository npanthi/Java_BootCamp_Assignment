import java.util.Arrays;
import java.util.Scanner;

public class UserDaoImpl {

    static User user [];
    void registration(){

    }
    boolean verifyUser(String userName,String password){
        System.out.println("userName" + "/n"+ password);
        System.out.println("userName" + "/n"+ userName);
        System.out.println("user stuff" + Arrays.toString(user));
        if(user !=null){
            // Do Stuff
        }
        else {
            System.out.println("It looks like user hasn't been register to our system, would you like to register yes ");
            System.out.println("1) Yes ");
            System.out.println("2) No");
            Scanner sc = new Scanner(System.in);
            if(sc.nextInt() == 1){
                registration();
            }
            else{
                return false;
            }
        }
      return false;
    }
}
