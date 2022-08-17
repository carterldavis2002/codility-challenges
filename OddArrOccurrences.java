import java.util.Arrays;

public class OddArrOccurrences {
    public static void main(String[] args) {
        int[] arr = {1,2,4,2,1,4,4,6,6};
        System.out.println(findUnpairedElement(arr));
    }

    private static int findUnpairedElement(int[] A) {
        Arrays.sort(A);
        int count = 1;
        for(int i = 0;i < A.length - 1;i++) {
            if(A[i + 1] == A[i]) count++;
            else {
                if(count % 2 != 0) return A[i];
                count = 1;
            }
        }

        return A[A.length - 1];
    }
}