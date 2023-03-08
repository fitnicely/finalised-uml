import java.util.Scanner;

public class User {
    // public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        //METHOD
        public void signUp(){
            
            Register person = new Register();

            System.out.println("\nEnter first name: ");
            String fname = in.nextLine();   
            System.out.println("\nEnter last name: ");
            String lname = in.nextLine();
    
            Name name =  new Name(fname, lname);
            person.setName(name);

            System.out.println("\nEnter email: ");
            String email = in.nextLine();

            System.out.println("\nEnter username: ");
            String username = in.nextLine();
    
            System.out.println("\nEnter password: ");
            String password = in.nextLine();

            person = new Register(name, email, username, password);
            System.out.println(person.toString());

        }

        public int welcome(){

            System.out.println("WELCOME TO FITNECELY");
            
            System.out.println("Option: 1 = Video Exercise 2 = Additional Information 3 = Search Bar");
            System.out.println("Enter choice: ");
        
            int choice = in.nextInt();

            return choice;

        }

        public void AdditionalInformation(){
            MainPage showInformation = new MainPage();
            showInformation.displayAdditionalInformation();
        }
        public void VideoTutorial(){
            MainPage playVideo = new MainPage();
            playVideo.displayTypeOfExercise();
        }

        public void SearchBar(){
            MainPage search = new MainPage();
            search.displaySearchBar();
        }
    
    // }
}
