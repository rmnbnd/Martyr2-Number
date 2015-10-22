public class PiPrinter {

    public static void main(String[] args) {
        if (args.length != 1) {
            return;
        }
        int number = Integer.parseInt(args[0]);
        System.out.println(getPI(number));
    }

    public static double getPI(int n) {
        long multiplier = (long) Math.pow(10, n);
        return (double) Math.round(Math.PI * multiplier) / multiplier;
    }

}
