package yatzyPackage;

public class FourOfAKindBehavior implements ScoreInterface{

    @Override
    public int score(int[] roll) {

        int[] counts = countDice(roll);

        return computeFourOfAKindScore(counts);
    }


    private int[] countDice(int[] roll) {

        int[] counts = new int[7];

        for (int die : roll) {
            counts[die]++;
        }

        return counts;
    }


    private int computeFourOfAKindScore(int[] counts) {

        for (int i = 1; i <= 6; i++) {

            if (counts[i] == 4) {
                return i * 4;
            }
        }

        return 0;
    }
}
