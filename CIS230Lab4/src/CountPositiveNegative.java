import java.util.Scanner;

public class CountPositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int total = 0;
        int number;
        double sum = 0;

        System.out.println("Enter integers (input ends when you enter 0): ");

        while (true) {
            number = scanner.nextInt();

            if (number == 0) {
                break;
            } else if (number > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }

            sum += number;
            total++;
        }

        if (total == 0) {
            System.out.println("No numbers are entered except 0");
        } else {
            double average = sum / total;

            System.out.println("The number of positive numbers is " + positiveCount);
            System.out.println("The number of negative numbers is " + negativeCount);
            System.out.println("The total is " + sum);
            System.out.println("The average is " + average);
        }

        scanner.close();
    }
}
