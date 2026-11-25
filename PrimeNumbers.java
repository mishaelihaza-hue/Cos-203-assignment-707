public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 0 and 500:");

        for (int number = 2; number <= 500; number++) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
        }

        System.out.println();
    }
}
