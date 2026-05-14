package yatzyPackage;

public class SmallStraightBehavior implements ScoreInterface{

    @Override
    public int score(int[] roll) {

        int[] counts = countDice(roll);

        if (isSmallStraight(counts)) {
            return 15;
        }
        return 0;
    }

    private int[] countDice(int[] roll) {

        int[] counts = new int[7];

        for (int die : roll) {
            counts[die]++;
        }

        return counts;
    }

    private boolean isSmallStraight(int[] counts) {

        for (int i = 1; i <= 5; i++) {

            if (counts[i] != 1) {
                return false;
            }
        }

        return counts[6] == 0;
    }
}
