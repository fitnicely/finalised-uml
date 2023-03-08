public class Register {

    //ATTRIBUTES
    private Name name;
    private String email;
    private String username;
    private String password;
    
    //METHODS
    //constructor
    public Register() {}
    public Register(Name nama, String email, String username, String password) {
        this.name = nama;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "Register [name=" + name + ", email=" + email + ", username=" + username + ", password=" + password
                + "]";
    }
    

}
