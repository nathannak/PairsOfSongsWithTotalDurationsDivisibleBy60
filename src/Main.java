import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[]{30,20,150,100,40};

        System.out.println( numPairsDivisibleBy60(arr) );

    }

    public static int numPairsDivisibleBy60(int[] time) {
        Map<Integer, Integer> count = new HashMap<>();
        int ans = 0;
        for (int t : time) {
            int d = (60 - t % 60) % 60;
            ans += count.getOrDefault(d, 0); // in current HashMap, get the number of songs that if adding t equals to a multiple of 60.
            count.put(t % 60, 1 + count.getOrDefault(t % 60, 0)); // update the number of t % 60.
        }
        return ans;
    }

}
