public class MilesToKilometers {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s | %-10s%-10s%n", "Miles", "Kilometers", "Kilometers", "Miles");
        System.out.println("--------------------------------------------");

        for (int i = 1, j = 20; i <= 10 && j <= 65; i++, j += 5) {
            double kilometers1 = i * 1.609;
            double miles2 = j / 1.609;

            System.out.printf("%-10d%-10.3f | %-10d%-10.3f%n", i, kilometers1, j, miles2);
        }
    }
}
