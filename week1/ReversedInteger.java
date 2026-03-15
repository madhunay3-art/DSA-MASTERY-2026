public class ReversedInteger {
    static int reverse(int x) {
        
        long acc = 0;
        while(x != 0) {
            acc = acc * 10 + x % 10;
            x = x/10;
        }

        if ((acc > Integer.MAX_VALUE) || (acc < Integer.MIN_VALUE)) return 0;
        return (int) acc;
    }
    public static void main(String[] args) {

        System.out.println(reverse(1234));

    }
    
}
