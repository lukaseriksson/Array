import java.util.ArrayList;
import java.util.Collections;

public class list {
    public static void main(String[] args) {
        ArrayList<Integer> Scores = new ArrayList<Integer>();
        Scores.add(33);
        Scores.add(15);
        Scores.add(20);
        Scores.add(34);
        Scores.add(8);
        Scores.add(12);

        Collections.sort(Scores);

        for (int i : Scores) {
            System.out.println(i);
        }
    }
}