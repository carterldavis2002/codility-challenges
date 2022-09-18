import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        int[] A = {2,3,4};
        System.out.println(solution(A));
    } 
    
    private static int solution(int[] A) {
        Arrays.sort(A);
        
        for(int i = 0;i < A.length - 2;i++) {
            long P = A[i];
            long Q = A[i + 1];
            long R = A[i + 2];

            if(P + Q > R && Q + R > P && P + R > Q)
                return 1;
        }

        return 0;
    }
}
