public class CalculatePi { //This might not be the most optimized way to do this
    public static void main(String[] args) {
        int[] iValues = {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000, 100000};

        for (int i : iValues) {
            double pi = calculatePi(i); //calling the method to calculate the value

            System.out.printf("For i = %d, pi ≈ %.15f%n", i, pi); //formatting the output
        }
    }

    public static double calculatePi(int i) { //start of calculate pi method
        double pi = 0;

        for (int j = 1; j <= i; j++) { //iteration
            double term = Math.pow(-1, j + 1) / (2.0 * j - 1);
            pi += term;
        }

        pi *= 4;

        return pi;
    }
}
