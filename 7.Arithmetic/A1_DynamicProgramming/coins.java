package A1_DynamicProgramming;


/**
 * @author :lujianbin
 * @create :2020-11-18 20:16:00
 * @description :����Ŀ�������ֵ���飬�󵱽��Ϊiʱ��Ҫ����öӲ��
 * @solution :��ֵ���⣺��̬�滮ö��
 */
public class coins {
	//dp�����Ե����Ϸ���
	public int coinChange(int[] coins, int amount) {
		//����dp����
		int[] dp = new int[amount + 1];
		for (int i = 0; i < amount + 1; i++) {
			//��һ����0������ÿһ��ֵ������amount+1
			dp[i] = i == 0 ? 0 : amount + 1;
			//Ŀ������ڵ�ǰ���Ž���״̬ת��
			for (int i1 = 0; i1 < coins.length; i1++) {
				int coin = coins[i1];
				if (i >= coin) {
					dp[i] = Math.min(dp[i - coin] + 1, dp[i]);  //Ŀ�����ȥ��ǰ������Сֵ
				}
			}
		}
		//û�й����ܽ���-1����Ŀ����Ϊamountʱ��������Ҫd[amount]öӲ��
		return dp[amount] == amount + 1 ? -1 : dp[amount];
	}
}
