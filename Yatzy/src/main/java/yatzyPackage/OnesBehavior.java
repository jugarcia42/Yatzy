package yatzyPackage;

public class OnesBehavior implements ScoreInterface{
    public int score(int[] roll){
        int j = 0;
        for (int i : roll){
            if (i == 1){
                j += 1;
            }
        }
        return j;
    }
}
