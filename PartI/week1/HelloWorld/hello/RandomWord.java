import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        int i = 0;
        String champ = "";
        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            i++;
            double p = 1.0 / i;
            if (StdRandom.bernoulli(p)) {
                champ = word;
            }
        }
        StdOut.println(champ);
    }
}
