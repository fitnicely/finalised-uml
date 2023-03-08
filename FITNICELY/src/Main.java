import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Type option = new Type();


        System.out.println("\n\nWelcome to FITNICELY ");
        System.out.println("Option: 1 = User 2 = Admin ");
        System.out.println("Enter choice: ");
        
        int userType = in.nextInt();
        option.userType(userType);

        if (option.userType(userType) == 1){
            System.out.println("Enter choice: ");
            System.out.println("Option: 1 = Sign Up, 2 = Log In ");
            userType = in.nextInt();
            if (userType == 1){
                User person = new User();
                person.signUp();
            }
            else if (userType == 2){
                Login person = new Login();
                person.Access();
                User verifiedPerson = new User();
                if (verifiedPerson.welcome()==1){
                    verifiedPerson.VideoTutorial();

                }
                else if(verifiedPerson.welcome()==2){
                    verifiedPerson.AdditionalInformation();
                }
                else if(verifiedPerson.welcome()==3){
                    verifiedPerson.SearchBar();
                 }
                            

            }
            
        }
        else if (option.userType(userType) == 2){
             //object for admin
             Login admin = new Login();
             admin.Access();

            
        }
        in.close();
    }

   
}