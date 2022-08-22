import java.util.Arrays;

public class MissingInteger {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,6};
        System.out.println(solution(arr));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);  
        if(A[A.length - 1] <= 0) return 1;

        int posIdx = 0;
        for(int i = 0;i < A.length;i++) {
            if(A[i] > 0) {
                posIdx = i;
                break;
            }
        }

        if(A[posIdx] > 1) return 1;

        int current = 1;
        for(int i = posIdx;i < A.length;i++) {
            if(A[i] != current && A[i] != current + 1) return ++current;

            if(A[i] == current + 1) current++;
        }

        return ++current;
    }
}
