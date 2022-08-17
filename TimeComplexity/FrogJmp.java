public class FrogJmp {
    public static void main(String[] args) {
        System.out.println(calculateJumps(Integer.parseInt(args[0]), 
            Integer.parseInt(args[1]), Integer.parseInt(args[2])));
    }

    private static int calculateJumps(int X, int Y, int D) {
        return (int) Math.ceil((Y - X) / (double) D);
    }
}
