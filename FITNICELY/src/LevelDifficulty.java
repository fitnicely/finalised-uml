import java.awt.Desktop;
import java.net.URI;

public class LevelDifficulty {

    String levels;

    public String getLevels() {
        return levels;
    }

    public void setLevels(String levels) {
        this.levels = levels;
    }


    public void getTutorial(String exc ,String levels){

        if ((exc == "yoga") || (exc == "YOGA")){

            if ((levels == "BEGINNER") || (levels == "beginner")){

                System.out.println("Here is your tutorial: ");
                try {
                    Desktop.getDesktop().browse(new URI("https://youtu.be/nQwKKCqkJxg"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            else if ((levels == "INTERMEDIATE") || (levels == "intermediate")){
                System.out.println("Here is your tutorial: ");
                try {
                    Desktop.getDesktop().browse(new URI("https://youtu.be/_LvGTQ3Aq-g"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            else if ((levels == "ADVANCE") || (levels == "advance")){
                System.out.println("Here is your tutorial: ");
                try {
                    Desktop.getDesktop().browse(new URI("https://youtu.be/6LeKFE_aB4I"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }

        else if ((exc == "pilates") || (exc == "PILATES")){

            if ((levels == "BEGINNER") || (levels == "beginner")){

                System.out.println("Here is your tutorial: ");
                try {
                    Desktop.getDesktop().browse(new URI("https://youtu.be/NyP_waVgL1w"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            else if ((levels == "INTERMEDIATE") || (levels == "intermediate")){
                System.out.println("Here is your tutorial: ");
                try {
                    Desktop.getDesktop().browse(new URI("https://youtu.be/zdz8c9a-rDo"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            else if ((levels == "ADVANCE") || (levels == "advance")){
                System.out.println("Here is your tutorial: ");
                try {
                    Desktop.getDesktop().browse(new URI("https://youtu.be/XcpTjvNOQnA"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }

        else if ((exc == "aerobic") || (exc == "AEROBIC")){

            if ((levels == "BEGINNER") || (levels == "beginner")){

                System.out.println("Here is your tutorial: ");
                try {
                    Desktop.getDesktop().browse(new URI("https://youtu.be/ZNpCqF9XRqQ"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            else if ((levels == "INTERMEDIATE") || (levels == "intermediate")){
                System.out.println("Here is your tutorial: ");
                try {
                    Desktop.getDesktop().browse(new URI("https://youtu.be/ZCbOZyLeQoQ"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            else if ((levels == "ADVANCE") || (levels == "advance")){
                System.out.println("Here is your tutorial: ");
                try {
                    Desktop.getDesktop().browse(new URI("https://youtu.be/kv0LUpu6hYk"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
