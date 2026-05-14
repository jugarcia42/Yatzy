package yatzyPackage;

public class SixesBehavior implements ScoreInterface{
    public int score(int[] roll){
        int j = 0;
        for (int i : roll){
            if (i == 6){
                j += 6;
            }
        }
        return j;
    }
}
