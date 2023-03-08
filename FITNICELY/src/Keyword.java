import java.util.ArrayList;

public class Keyword {

    //protected String[] videoKeywords= {"pilates","yoga","zumba","aerobic","beginner","easy","intermediate","medium","expert","hard"};
    //protected String[] navigationKeyword = {"profile","tips","log out","faq","question"};
    private ArrayList<String> videoKeyword = new ArrayList<String>();
    private ArrayList<String> navigationKeyword = new ArrayList<String>();

    public ArrayList<String> setInitialVideoKeyword() {
        videoKeyword.add("pilates");
        videoKeyword.add("yoga");
        videoKeyword.add("zumba");
        videoKeyword.add("aerobic");
        videoKeyword.add("beginner");
        videoKeyword.add("easy");
        videoKeyword.add("intermediate");
        videoKeyword.add("medium");
        videoKeyword.add("expert");
        videoKeyword.add("hard");
        return videoKeyword;
    }

    public ArrayList<String> setInitialNavigationKeyword(){
        navigationKeyword.add("profile");
        navigationKeyword.add("tips");
        navigationKeyword.add("log out");
        navigationKeyword.add("question");
        return navigationKeyword;
    }


}
