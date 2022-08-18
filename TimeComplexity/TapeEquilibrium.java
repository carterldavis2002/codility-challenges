public class TapeEquilibrium {
    public static void main(String[] args) {
        int[] arr = {4,2,6};
        System.out.println(findMinDifference(arr));
    }

    private static int findMinDifference(int[] A) {
        if(A.length == 2) return Math.abs(A[0] - A[1]);

        int total = 0;
        for(int i : A) total += i;

        int leftSum = 0;
        int rightSum = 0;
        int minDifference = Integer.MAX_VALUE;

        for(int i = 0;i < A.length - 1;i++) {
            leftSum += A[i];
            rightSum = total - leftSum;
            minDifference = Math.min(minDifference, Math.abs(leftSum - rightSum));
        }

        return minDifference;
    }
}
