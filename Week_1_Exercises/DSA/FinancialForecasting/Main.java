public class Main {
    public static void main(String[] args) {
        FinancialForecasting forecasting = new FinancialForecasting();
        double presentValue = 1000.0; // Initial value
        double growthRate = 0.05; // 5% growth rate
        int periods = 10; // Number of periods (years)

        // Calculate future value using the recursive method
        double futureValue = forecasting.calculateFutureValue(presentValue, growthRate, periods);
        System.out.println("Future Value (Recursive): " + futureValue);

        // Calculate future value using the memoized recursive method
        Double[] memo = new Double[periods + 1];
        double futureValueMemoized = forecasting.calculateFutureValueMemoized(presentValue, growthRate, periods, memo);
        System.out.println("Future Value (Memoized): " + futureValueMemoized);
    }
}
