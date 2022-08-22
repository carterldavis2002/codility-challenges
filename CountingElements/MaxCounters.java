import java.util.Arrays;

public class MaxCounters {
    public static void main(String[] args) {
        int[] arr = {3,4,4,6,1,4,4,6,1,3,3};
        for(int i : solution(5, arr)) System.out.print(i + " ");
    }

    private static int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        Arrays.fill(counters, 0);

        int prevMax = 0, currMax = 0;
        for(int i : A) {
            if(i <= N) {
                if(counters[i - 1] < prevMax) counters[i - 1] = prevMax + 1;
                else counters[i - 1]++;

                if(counters[i - 1] > currMax) currMax = counters[i - 1];
            }
            else
                prevMax = currMax;
        }

        for(int i = 0;i < counters.length;i++) {
            if(counters[i] < prevMax)
                counters[i] = prevMax;
        }

        return counters;
    }
}
