public class Name {
    //ATTRIBUTES
    private String fname;
    private String lname;
    private User person;

    //METHODS
    //constructor
    public Name(){}
    public Name(String fname,  String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    //to string
    @Override
    public String toString() {
        return fname +  ' ' + lname ;
    }

    //getter
    public String getFname(){
        return fname;
    }
    public String Lname(){
        return lname;
    }

    //setter
    public void setFname(String fname){
        this.fname=fname;
    }

    public void setLname(String lname){
        this.lname=lname;
    }

}