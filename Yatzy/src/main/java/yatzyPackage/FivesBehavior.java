package yatzyPackage;

public class FivesBehavior implements ScoreInterface{
    public int score(int[] roll){
        int j = 0;
        for (int i : roll){
            if (i == 5){
                j += 5;
            }
        }
        return j;
    }
}
