public class KilogramsToPounds {
    public static void main(String[] args) {
        final double POUNDS_PER_KILOGRAM = 2.2;

        int kilograms = 1;

        //printing ou tthe results
        System.out.println("Kilograms\tPounds");

        //run while loop as long as kg is below 200
        while (kilograms <= 199) {
            double pounds = kilograms * POUNDS_PER_KILOGRAM;

            System.out.printf("%-10d\t%.2f\n", kilograms, pounds);

            kilograms++;
        }
    }
}
