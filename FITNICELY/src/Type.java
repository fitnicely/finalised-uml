public class Type {
    private int pageType;

    public int userType(int userType){
         if (userType == 1) {
           pageType = 1;
       }
       else if (userType == 2) {
            pageType = 2;
           }
       else {
              System.out.println("Unknown input! Program closing..");
              System.exit(1);
          }

        return pageType;
    }
}
