import java.util.ArrayList;
import java.util.Scanner;

public class Search {
    //REFER THIS AS NAVIGATION CLASS IN UML DIAGRAM

    Keyword keyword = new Keyword();

    Scanner cin = new Scanner(System.in);
    private ArrayList<String> videoKeyword = new ArrayList<>();
    private ArrayList<String> naviKeyword = new ArrayList<>();

    public ArrayList<String> getVideoKeyword() {
        return videoKeyword;
    }
    public ArrayList<String> getNaviKeyword(){
        return naviKeyword;
    }

    public void setIniVideoKeyword() {
        videoKeyword = keyword.setInitialVideoKeyword();
        System.out.println(videoKeyword);

    }
    public void setIniNavigationKeyword() {
        naviKeyword = keyword.setInitialNavigationKeyword();
    }


    public Boolean findKeyword(String searchWord){
            if (videoKeyword.contains((searchWord))){
                return true;
            }
        return false;
    }
    public Boolean findNavigation(String searchFeatures){

        if (naviKeyword.contains(searchFeatures)){
            return true;

        }
        return false;
    }

   public void updateKeyword(String key){
        System.out.println("enter which type of keyword to update\n[1] video keyword\n[2]Search keyword");
       try {
        int ans = cin.nextInt();
        if(ans ==1){
            videoKeyword.add(key);
        }
        else if (ans==2){
            naviKeyword.add(key);
        }}
        catch(Exception ex) {
           System.out.println("Wrong Data Type");
           ex.printStackTrace();  //method in class exception

       }

    }

    public void removeKeyword(String key){
        System.out.println("enter which type of keyword to remove\n[1] video keyword\n[2]Search keyword");
        try {
        int ans = cin.nextInt();
        if(ans ==1){
            videoKeyword.remove(key);
        }
        else{
            naviKeyword.remove(key);
        }    }
    catch(Exception ex) {
            System.out.println("Wrong Data Type");
            ex.printStackTrace();  //method in class exception

        }
    }

    public ArrayList<String> displayList(){
        System.out.println("enter which type of keyword\n[1] video keyword\n[2]Search keyword");
        try {  //try block....something in here can cause exception, potentially ada error
            int ans = cin.nextInt();
            if(ans ==1){
                return videoKeyword;
            }
            else if (ans ==2){
                return naviKeyword;
            }
        }
        catch(Exception ex) {//catch block..action to be taken in case Exception //class exception then the parameter
            System.out.println("Wrong Data Type");
            ex.printStackTrace();  //method in class exception

        }
    return null;}
}
