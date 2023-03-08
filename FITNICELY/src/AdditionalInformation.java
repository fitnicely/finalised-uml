import java.util.*;
import java.util.ArrayList;

class AdditionalInformation {
    public void printInformation() {
        AdditionalInformationUpdate adminClass = new AdditionalInformationUpdate();
        adminClass.List();
        adminClass.removeElement();
        ArrayList<String> InformationList = adminClass.getList();

        Random rand = new Random();
        int size = InformationList.size();
        int index = rand.nextInt(size);
        String randomString = InformationList.get(index);
        System.out.println(randomString);



        /*for (String element : InformationList) {
            System.out.println(element);
        }*/


    }

}

