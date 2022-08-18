import java.util.Arrays;

public class PermCheck {
    public static void main(String[] args) {
        int[] arr = {1,3};
        System.out.println(isPermutation(arr));
    }

    private static int isPermutation(int[] A) {
        Arrays.sort(A);

        for(int i = 0;i < A.length;i++)
            if(A[i] != i + 1) return 0;

        return 1;
    }
}