package yatzyPackage;

public class LargeStraightBehavior implements ScoreInterface{
    @Override
    public int score(int[] roll) {

        int[] counts = countDice(roll);

        if (isLargeStraight(counts)) {
            return 20;
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

    private boolean isLargeStraight(int[] counts) {

        for (int i = 2; i <= 6; i++) {

            if (counts[i] != 1) {
                return false;
            }
        }

        return counts[1] == 0;
    }
}
