import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class AdditionalInformationUpdate {
    ArrayList<String> InformationList = new ArrayList<String>();

    public void List() {
        InformationList.add("Create healthy habits, not restrictions.");
        InformationList.add("Healthy is an outfit that looks different on everybody.");
        InformationList.add("He who has health has hope and he who has hope has everything.");
        InformationList.add("Let’s build wellness rather than treat disease");
        InformationList.add("A healthy outside starts from the inside.");
        InformationList.add("It is health that is real wealth and not pieces of gold and silver.");
    }

    public ArrayList getList() {
        return InformationList;
    }
    public void removeElement() {
        InformationList.remove("He who has health has hope and he who has hope has everything.");
    }
}
