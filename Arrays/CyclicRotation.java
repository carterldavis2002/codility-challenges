public class CyclicRotation {
    public static void main(String[] args) {
        int[] arr = {1};
        rotateArray(arr, 3);
        for(int i : arr) System.out.print(i + ", ");
    }

    private static int[] rotateArray(int[] arr, int num) {
        if(arr.length == 0 || arr.length == 1 || num % arr.length == 0) return arr;

        num %= arr.length;
        for(int i = 0;i < num;i++) {
            int tmp = arr[0];
            arr[0] = arr[arr.length - 1];
            for(int j = 1;j < arr.length;j++) {
                int tmp2 = arr[j];
                arr[j] = tmp;
                tmp = tmp2;
            }
        }

        return arr;
    }
}