package yatzyPackage;

public class TwosBehavior implements ScoreInterface{
    public int score(int[] roll){
        int j = 0;
        for (int i : roll){
            if (i == 2){
                j += 2;
            }
        }
        return j;
    }
}
