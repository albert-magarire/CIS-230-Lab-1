public class KilogramsToPounds {
    public static void main(String[] args) {
        final double POUNDS_PER_KILOGRAM = 2.2;

        int kilograms = 1;

        System.out.println("Kilograms\tPounds");

        while (kilograms <= 199) {
            double pounds = kilograms * POUNDS_PER_KILOGRAM;

            System.out.printf("%-10d\t%.2f\n", kilograms, pounds);

            kilograms++;
        }
    }
}
