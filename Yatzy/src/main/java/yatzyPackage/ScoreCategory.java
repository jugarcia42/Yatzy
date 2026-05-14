package yatzyPackage;

public class ScoreCategory {

    private ScoreInterface behaviour;

    public ScoreCategory(ScoreInterface behaviour) {
        this.behaviour = behaviour;
    }

    public int score(int[] roll) {
        return behaviour.score(roll);
    }
}