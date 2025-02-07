/**
 * The class Making Change solves a classic problem:
 * given a set of coins, how many ways can you make change for a target amount?
 *
 * @author Zach Blick
 * @author [Lucas Ying]
 */

public class MakingChange {
    public static long countWays(int target, int[] coins) {
        // Create 2d array table
        long[][] table = new long[coins.length + 1][target + 1];

        // Base Case: Only 1 way to make 0 amount
        for (int i = 0; i < coins.length; i++) {
            table[i][0] = 1;
        }

        // Fill the table
        for (int i = 1; i <= coins.length; i++) {
            for (int j = 0; j <= target; j++) {
                // Include the current coin if j is at least as large as the coin's denomination
                long withCoin = 0;
                if (j >= coins[i-1]) {
                    withCoin = table[i][j - coins[i-1]];
                }
                // Exclude the current coin
                long withoutCoin = table[i-1][j];
                // Sum up the ways including and excluding the current coin
                table[i][j] = withoutCoin + withCoin;
            }
        }
        // Return the number of ways to make the target amount using the available coins
        return table[coins.length][target];
    }
}
