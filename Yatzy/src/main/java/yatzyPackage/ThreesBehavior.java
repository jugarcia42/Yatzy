package yatzyPackage;

public class ThreesBehavior implements ScoreInterface{
    public int score(int[] roll){
        int j = 0;
        for (int i : roll){
            if (i == 3){
                j += 3;
            }
        }
        return j;
    }
}
