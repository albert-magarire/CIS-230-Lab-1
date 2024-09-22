public class WeightConversion {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s | %-10s%-10s%n", "Kilograms", "Pounds", "Pounds", "Kilograms");

        for (int kg = 1, lb = 20; kg <= 199 && lb <= 515; kg += 2, lb += 5) {
            double pounds1 = kg * 2.2;
            double kilograms2 = lb / 2.2;

            System.out.printf("%-10d%-10.2f | %-10d%-10.2f%n", kg, pounds1, lb, kilograms2);
        }
    }
}
