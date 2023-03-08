public class TypeOfExercise {
    private String name;
    private String difficulty;

    public TypeOfExercise(String name, String difficulty) {
        this.name = name;
        this.difficulty = difficulty;
    }

    public TypeOfExercise() {
    }

    public String getName() {
        return name;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public static void main(String[] args) {
        TypeOfExercise u1 = new TypeOfExercise("pilates", "intermediate");
        LevelDifficulty levels = new LevelDifficulty();
        levels.getTutorial(u1.getName(), u1.getDifficulty());
    }
}
