public class MinAvgTwoSlice {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(solution(arr));
    }

    private static int solution(int[] A) {
        for(int i = 1;i < A.length;i++) A[i] += A[i - 1];

        double minAvg = A[1] / 2.0;
        int minIdx = 0;
        for(int i = 2;i < A.length;i++) {
            double currentAvg = (A[i] - A[i - 2]) / 2.0;
            if(currentAvg < minAvg) {
                minAvg = currentAvg;
                minIdx = i - 1;
            }

            if(i - 3 >= 0)
                currentAvg = (A[i] - A[i - 3]) / 3.0;
            else
                currentAvg = A[i] / 3.0;

            if(currentAvg < minAvg) {
                minAvg = currentAvg;

                if(i - 3 >= 0)
                    minIdx = i - 2;
                else minIdx = 0;
            }
        }

        return minIdx;
    }
}