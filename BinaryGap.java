public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(findLongestBinaryGap(Integer.parseInt(args[0])));
    }

    private static int findLongestBinaryGap(int num) {
        String bin = Integer.toBinaryString(num);
        int longestGap = 0;
        int currentGap = 0;
        for(int i = 0;i < bin.length();i++) {
            if(bin.charAt(i) == '1') {
                if(currentGap > longestGap) longestGap = currentGap;
                currentGap = 0;
            }

            if(bin.charAt(i) == '0') currentGap++;
        }

        return longestGap;
    }
}