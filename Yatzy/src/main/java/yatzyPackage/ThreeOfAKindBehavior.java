package yatzyPackage;

public class ThreeOfAKindBehavior implements ScoreInterface {

    @Override
    public int score(int[] roll) {

        int[] counts = countDice(roll);

        return computeThreeOfAKindScore(counts);
    }


    private int[] countDice(int[] roll) {

        int[] counts = new int[7];

        for (int die : roll) {
            counts[die]++;
        }

        return counts;
    }


    private int computeThreeOfAKindScore(int[] counts) {

        for (int i = 1; i <= 6; i++) {

            if (counts[i] == 3) {
                return i * 3;
            }
        }

        return 0;
    }
}