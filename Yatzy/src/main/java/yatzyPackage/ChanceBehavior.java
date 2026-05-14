package yatzyPackage;

import java.util.Arrays;

public class ChanceBehavior implements ScoreInterface {
    public int score(int[] roll){
        return Arrays.stream(roll).sum();
    }
}
