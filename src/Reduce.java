public class Reduce {
    public static void main(String[] args) {

        int steps = 0;

        int n = 100;
        int reduceTo = 0;

        while (n > reduceTo) {
            if (n % 2 == 0) {
                n /= 2;
            } else { //If n is not even, then n is guaranteed to be odd
                n -= 1;
            }
            steps ++;
        }

        System.out.println(steps);
    }
}
