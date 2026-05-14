package yatzyPackage;

public class TwoPairsBehavior implements ScoreInterface {

    @Override
    public int score(int[] roll) {

        int[] counts = countDice(roll);

        return computeTwoPairsScore(counts);
    }

    private int[] countDice(int[] roll) {
        int[] counts = new int[7];

        for (int die : roll) {
            counts[die]++;
        }

        return counts;
    }

    private int computeTwoPairsScore(int[] counts) {

        int pairsFound = 0;
        int sum = 0;

        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 2) {
                pairsFound++;
                sum += i * 2;
            }
        }

        if (pairsFound == 2) {
            return sum;
        }

        return 0;
    }
}