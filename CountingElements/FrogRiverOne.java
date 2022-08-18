import java.util.Arrays;

public class FrogRiverOne {
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,1,1};
        System.out.println(findEarliestJump(2, arr));
    }

    private static int findEarliestJump(int X, int[] A) {
        int[] positionIdx = new int[X];
        Arrays.fill(positionIdx, -1);

        for(int i = 0;i < A.length;i++) {
            if(positionIdx[A[i] - 1] == -1) positionIdx[A[i] - 1] = i;
        }

        int maxIdx = 0;
        for(int i : positionIdx) {
            if(i == -1) return -1;

            maxIdx = Math.max(maxIdx, i);
        }

        return maxIdx;
    }
}
