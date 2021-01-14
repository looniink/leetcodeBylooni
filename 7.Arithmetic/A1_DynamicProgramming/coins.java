package A1_DynamicProgramming;


/**
 * @author :lujianbin
 * @create :2020-11-18 20:16:00
 */
public class coins {
	public int coinChange(int[] coins, int amount) {
		int[] dp = new int[amount + 1];
		for (int i = 0; i < amount + 1; i++) {
			dp[i] = i == 0 ? 0 : amount + 1;
			for (int i1 = 0; i1 < coins.length; i1++) {
				int coin = coins[i1];
				if (i >= coin) {
					dp[i] = Math.min(dp[i - coin] + 1, dp[i]);
				}
			}
		}
		return dp[amount] == amount + 1 ? -1 : dp[amount];
	}
}
