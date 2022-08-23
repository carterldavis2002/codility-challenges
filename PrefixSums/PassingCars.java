public class PassingCars {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        for(int i = 0;i < arr.length;i++)
            arr[i] = i % 2 == 0 ? 0 : 1;
        System.out.println(solution(arr));
    }

    private static int solution(int[] A) {
        int pairs = 0;
        int zeroCount = 0;
        for(int i : A) {
            if(i == 0) zeroCount++;

            if(zeroCount != 0 && i == 1)
                pairs += zeroCount;

            if(pairs > 1000000000) return -1;
        }

        return pairs;
    } 
}
