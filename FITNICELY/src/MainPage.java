public class MainPage {

    TypeOfExercise[] exercise = new TypeOfExercise[3];
    LevelDifficulty[] exerciseLevel = new LevelDifficulty[3];
    

    public MainPage() {
    }

    public MainPage(TypeOfExercise[] exercise, LevelDifficulty[] exerciseLevel) {
        this.exercise = exercise;
        this.exerciseLevel = exerciseLevel;
    }

    public TypeOfExercise[] getExercise() {
        return exercise;
    }

    public void setExercise(TypeOfExercise[] exercise) {
        this.exercise = exercise;
    }

    public LevelDifficulty[] getExerciseLevel() {
        return exerciseLevel;
    }

    public void setExerciseLevel(LevelDifficulty[] exerciseLevel) {
        this.exerciseLevel = exerciseLevel;
    }

    public static void displayTutorial(){
        //put link or something
    }

    public void displayAdditionalInformation(){
        AdditionalInformation display = new AdditionalInformation();
        display.printInformation();
        //put information on how to perform the exercise
    }

    public void displayTypeOfExercise(){
        TypeOfExercise display = new TypeOfExercise();
                
    }

    public void displaySearchBar(){
        SearchBar display = new SearchBar();
        display.findInSearch();
                
    }
}
