package yatzyPackage;

public class FoursBehavior implements ScoreInterface{
    public int score(int[] roll){
        int j = 0;
        for (int i : roll){
            if (i == 4){
                j += 4;
            }
        }
        return j;
    }
}
