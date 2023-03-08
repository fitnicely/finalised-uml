import java.util.Scanner;

public class Login{

    private String username;
    private String password;
    private int size = 0;

    public Login() {
    }
    public Login(String username, String password, int size) {
        this.username = username;
        this.password = password;
        this.size = size;
    }

    public void Access(){
        Scanner in = new Scanner(System.in);

        System.out.println("\nEnter username: ");
        String username = in.nextLine();
        
        System.out.println("\nEnter password: ");
        String password = in.nextLine();
    
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

        // nanti somewhere letak .find utk cari username and password - maybe in UserList
    // public boolean find(){
        
    //     for(int i = 0; i < size; i++){
            
    //     }
        
    // }
}