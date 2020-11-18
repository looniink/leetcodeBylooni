package A1_DynamicProgramming;

import java.util.Scanner;

/**
 * @author :lujianbin
 * @create :2020-11-17 19:16:00
 * @description :���쳲��������еĵ�n��  ==> �ص�������
 * @solution :�����ݹ����ⶼ�����ݹ���
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

	//쳲�����������ͨ�ݹ�    �������ص�
	public static int fib(int N) {
		if (N < 0) return 0;
		if (N == 1 || N == 2) return 1;
		return fib(N - 1) + fib(N - 2);
	}

	//������¼��쳲����������㷨  ���ñ���¼����������ص�������
	//������䵱����¼
	public static int fib1(int N) {
		if (N < 1) return 0;
		int[] memo = new int[N + 1];
		return help(memo, N);
	}

	//����¼ �Զ�����  (��̬�滮���Ե�����)
	public static int help(int[] memo, int N) {
		if (N < 0) return 0;
		if (N == 1 || N == 2) return 1;
		if (memo[N] != 0) return memo[N];   //�ӱ���¼�в�ѯ
		memo[N] = help(memo, N - 1) + help(memo, N - 2);    //�����������뱸��¼��
		return memo[N];
	}

	//��������ĵ����ⷨ     ���Ʊ�dp(�Ե�����)
	public static int fib2(int N) {
		int[] dp = new int[N + 1];

		dp[1] = dp[2] = 1;
		for (int i = 3; i <= N; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[N];
	}

	//����״̬���̲���Ҫ��ô����DP table���洢״̬��ֻ��Ҫ�洢ǰ����״̬����
	public static int fib3(int N) {
		if (N == 1 || N == 2) return 1;
		int prev = 1, curr = 1;
		for (int i = 3; i <= N; i++) {
			int sum = prev + curr;  //����ǰ����״̬���
			prev = curr;            //�滻״̬
			curr = sum;
		}
		return curr;
	}
}
