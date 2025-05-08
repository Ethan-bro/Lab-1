public class Multiples {
    public static void main(String[] args) {
        int limit = 1000;
        int i = 3;
        int count = 0;
        while (i < limit) {
            boolean divby3 = i % 3 == 0;
            boolean divby5 = i % 5 == 0;
            if (divby3 || divby5) {
                count ++;
            }
            i ++;
        }
        System.out.println("There are " + count + " multiples of 3 or 5 less than " + limit);
    }
}
