package yatzyPackage;

public class FullHouseBehavior implements ScoreInterface{
    @Override
    public int score(int[] roll) {
        int[] counts = countDice(roll);

        int bestPair = findBestPair(counts);
        int pairCount = countPairCount(counts);

        int Pair = computeScore(bestPair, pairCount);
        int ThreeOfAKind = computeThreeOfAKindScore(counts);

        if (Pair > 0 && ThreeOfAKind > 0){
            return Pair + ThreeOfAKind;
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

    private int findBestPair(int[] counts) {
        int bestPair = 0;

        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 2) {
                bestPair = Math.max(bestPair, i);
            }
        }

        return bestPair;
    }

    private int countPairCount(int[] counts) {
        int pairCount = 0;

        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 2) {
                pairCount++;
            }
        }

        return pairCount;
    }

    private int computeScore(int bestPair, int pairCount) {
        if (pairCount > 0) {
            return bestPair * 2;
        }
        return 0;
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
