package A1_DynamicProgramming;

import java.util.Scanner;

/**
 * @author :lujianbin
 * @create :2020-11-17 19:16:00
 * @description :输出斐波那契数列的第n项  ==> 重叠子问题
 * @solution :遇到递归问题都画出递归树
 */
public class fib {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();

		final long start1 = System.nanoTime();
		System.out.println(fib(nextInt));
		final long end1 = System.nanoTime();
		System.out.println("Digui time: " + (end1 - start1));

		System.out.println(fib1(nextInt));
		final long end2 = System.nanoTime();
		System.out.println("Beiwang time: " + (end2 - end1));

		System.out.println(fib2(nextInt));
		long end3 = System.nanoTime();
		System.out.println("DP time : " + (end3 - end2));

		System.out.println(fib3(nextInt));
		long end4 = System.nanoTime();
		System.out.println("DP Next time : " + (end4 - end3));
	}

	//斐波那契数列普通递归    子问题重叠
	public static int fib(int N) {
		if (N < 0) return 0;
		if (N == 1 || N == 2) return 1;
		return fib(N - 1) + fib(N - 2);
	}

	//带备忘录的斐波那契数列算法  利用备忘录解决子问题重叠的问题
	//用数组充当备忘录
	public static int fib1(int N) {
		if (N < 1) return 0;
		int[] memo = new int[N + 1];
		return help(memo, N);
	}

	//备忘录 自顶向下  (动态规划：自底向上)
	public static int help(int[] memo, int N) {
		if (N < 0) return 0;
		if (N == 1 || N == 2) return 1;
		if (memo[N] != 0) return memo[N];   //从备忘录中查询
		memo[N] = help(memo, N - 1) + help(memo, N - 2);    //将计算结果存入备忘录中
		return memo[N];
	}

	//递推数组的迭代解法     递推表dp(自底向上)
	public static int fib2(int N) {
		int[] dp = new int[N + 1];

		dp[1] = dp[2] = 1;
		for (int i = 3; i <= N; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[N];
	}

	//根据状态方程不需要那么长的DP table来存储状态，只需要存储前两个状态即可
	public static int fib3(int N) {
		if (N == 1 || N == 2) return 1;
		int prev = 1, curr = 1;
		for (int i = 3; i <= N; i++) {
			int sum = prev + curr;  //将当前两个状态相加
			prev = curr;            //替换状态
			curr = sum;
		}
		return curr;
	}
}
