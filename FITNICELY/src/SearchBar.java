import java.util.Scanner;
public class SearchBar {


    public static void findInSearch() {


        Scanner cin = new Scanner (System.in);
    Search search = new Search();
        search.setIniVideoKeyword();
        search.setIniNavigationKeyword();
        System.out.println("Enter keyword: ");
    String word = cin.nextLine();
    Boolean isIn = search.findKeyword(word.toLowerCase());
    if (isIn == true) {
        System.out.println("ok jumpa");
        }
    else {
        isIn = search.findNavigation(word.toLowerCase());
        if (isIn == true) {
            System.out.println("ok jumpa NAVI");
        } else {
            System.out.println("CANNOT FIND");
        }

    }
    System.out.println("Enter the word to update into the list");
    String keyword = cin.nextLine();
    search.updateKeyword(keyword);
    System.out.println("-----------list updated----------");
    System.out.println( search.displayList());


        System.out.println("Enter the word to remove from the list");
        String removeWord = cin.nextLine();
        search.removeKeyword(removeWord);
        System.out.println("-----------list updated----------");
        System.out.println("search video Arraylist =" + search.getVideoKeyword());
        System.out.println("search video Arraylist =" + search.getNaviKeyword());

        cin.close();
} 
}