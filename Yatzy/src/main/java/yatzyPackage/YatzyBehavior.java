package yatzyPackage;

public class YatzyBehavior implements ScoreInterface{
    @Override
    public int score(int[] roll) {
        int first = roll[0];

        for (int die : roll) {
            if (die != first) {
                return 0;
            }
        }
        return 50;
    }
}
