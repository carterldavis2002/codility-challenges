import java.util.Arrays;

public class PermMissingElem {
    public static void main(String[] args) {
        int[] arr = {3,1};
        System.out.println(findMissingElem(arr));
    }

    private static int findMissingElem(int[] A) {
        Arrays.sort(A);

        for(int i = 1;i <= A.length;i++) {
            if(A[i - 1] != i) return i;
        }

        return A.length + 1;
    }
}
