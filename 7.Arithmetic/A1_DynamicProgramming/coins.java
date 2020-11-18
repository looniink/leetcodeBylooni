package A1_DynamicProgramming;


/**
 * @author :lujianbin
 * @create :2020-11-18 20:16:00
 * @description :给出目标金额和面值数组，求当金额为i时需要多上枚硬币
 * @solution :最值问题：动态规划枚举
 */
public class coins {
	//dp数组自底向上方法
	public int coinChange(int[] coins, int amount) {
		//设置dp数组
		int[] dp = new int[amount + 1];
		for (int i = 0; i < amount + 1; i++) {
			//第一个存0，其余每一个值都存入amount+1
			dp[i] = i == 0 ? 0 : amount + 1;
			//目标金额大于当前金额才进行状态转移
			for (int i1 = 0; i1 < coins.length; i1++) {
				int coin = coins[i1];
				if (i >= coin) {
					dp[i] = Math.min(dp[i - coin] + 1, dp[i]);  //目标金额减去当前金额的最小值
				}
			}
		}
		//没有构成总金额返回-1，当目标金额为amount时，至少需要d[amount]枚硬币
		return dp[amount] == amount + 1 ? -1 : dp[amount];
	}
}
