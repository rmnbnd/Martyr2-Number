public class FibonacciPrinter {

    private static final String FLAG_MAX = "-m";

    public static void main(String[] args) {
        if (args.length == 1) {
            int number = Integer.parseInt(args[0]);
            printFibonacciByCountNumbers(number);
        } else if (args.length == 2) {
            String flag = args[0];
            if (FLAG_MAX.equals(flag)) {
                int max = Integer.parseInt(args[1]);
                printFibonacciByMaxNumber(max);
            }
        }
    }

    private static void printFibonacciByMaxNumber(int max) {
        int i = 1;
        while (true) {
            int number = fibonacci(i++);
            if (number >= max) {
                break;
            }
            System.out.println(number);
        }
    }

    private static void printFibonacciByCountNumbers(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(fibonacci(i));
        }
    }

    private static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
