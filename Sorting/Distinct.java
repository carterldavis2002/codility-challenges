import java.util.Arrays;

public class Distinct {
    public static void main(String[] args) {
        int[] arr = {5,6,5,-5};
        System.out.println(solution(arr));
    }

    private static int solution(int[] A) {
        if(A.length == 0) return 0;

        Arrays.sort(A);

        int distinct = 1;
        int current = A[0];
        for(int i = 1;i < A.length;i++) {
            if(A[i] != current) {
                distinct++;
                current = A[i];
            }
        }

        return distinct;
    }
}
