import java.math.BigInteger;

public class Fibonacci {
    public static void main(String[] args) {
        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;

        System.out.println("First 100 numbers of the Fibonacci sequence:");

        for (int i = 1; i <= 100; i++) {
            System.out.print(first);

            if (i < 100) {
                System.out.print(" ");
            }

            BigInteger next = first.add(second);
            first = second;
            second = next;
        }

        System.out.println();
    }
}
