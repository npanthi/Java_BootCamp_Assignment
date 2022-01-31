import java.util.Scanner;

public class UserClient {
    public static void main (String[] args){
      boolean isExit = true;
      int selection = 0;
        {
            System.out.println("****** Welcome to Login Management System, Please select the number below");
            UserDaoImpl userImpl = new UserDaoImpl();
            while(isExit){
                System.out.println("1) Register");
                System.out.println("2) Login");
                System.out.println("3) Exit");
                Scanner sc = new Scanner(System.in);
                selection = sc.nextInt();
               // System.out.println(selection + "/n1");
                switch (selection){
                    case 1 :{
                        userImpl.verifyUser("nisan","test");
                        break;
                    }
                    case 2 :{
                        System.out.println("case 2");

                        break;
                    }
                    case 3 :{
                        System.out.println("case 3");
                        System.exit(0);
                        break;
                    }
                    default:System.out.println("Please enter the number");
                }
            }
        }

    }
}
