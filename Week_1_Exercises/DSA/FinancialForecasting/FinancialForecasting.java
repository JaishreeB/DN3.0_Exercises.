public class FinancialForecasting {

    // Recursive method to calculate future value
    public double calculateFutureValue(double presentValue, double growthRate, int periods) {
        // Base case: when periods is 0, return present value
        if (periods == 0) {
            return presentValue;
        }
        // Recursive case: calculate future value for the next period
        return (1 + growthRate) * calculateFutureValue(presentValue, growthRate, periods - 1);
    }

    // Optimized method using memoization to avoid excessive computation
    public double calculateFutureValueMemoized(double presentValue, double growthRate, int periods, Double[] memo) {
        // Base case: when periods is 0, return present value
        if (periods == 0) {
            return presentValue;
        }
        // If the result is already computed, return it from memo array
        if (memo[periods] != null) {
            return memo[periods];
        }
        // Recursive case: calculate future value for the next period and store it in memo array
        memo[periods] = (1 + growthRate) * calculateFutureValueMemoized(presentValue, growthRate, periods - 1, memo);
        return memo[periods];
    }
}
