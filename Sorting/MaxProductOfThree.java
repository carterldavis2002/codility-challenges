import java.util.Arrays;

public class MaxProductOfThree {
    public static void main(String[] args) {
        int[] A = {-10,-7,-5,-4};
        System.out.println(solution(A));
    }

    private static int solution(int[] A) {
        Arrays.sort(A);
        int secondHalf;
        if(A[A.length - 1] < 0 || A[A.length - 2] * A[A.length - 3] > A[0] * A[1]) secondHalf = A[A.length - 2] * A[A.length - 3];
        else secondHalf = A[0] * A[1];
        return A[A.length - 1] * secondHalf;
    }
}