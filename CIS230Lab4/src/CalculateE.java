import java.math.BigDecimal;

public class CalculateE {
    public static void main(String[] args) {
        int iterations = 20;

        for (int iterationsCount = 1; iterationsCount <= iterations; iterationsCount++) {
            BigDecimal e = BigDecimal.ONE;
            BigDecimal item = BigDecimal.ONE;

            for (int i = 1; i <= iterationsCount; i++) {
                item = item.divide(BigDecimal.valueOf(i), 16, BigDecimal.ROUND_HALF_UP);

                e = e.add(item);
            }
            System.out.println("e value for i = " + iterationsCount + ": " + e);
        }
    }
}
