package L1_013;


import java.util.Scanner;

/**
 * @author :lujianbin
 * @create :2020-11-13 15:58:00
 * @description :L1-013 计算阶乘和 (10分)
 * @solution :
 */
public class Main {


	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		for (int i = 1; i <= nextInt; i++) {
			sum += dfs(i);
		}
		System.out.println(sum);
	}

	//static修饰类的成员变量
	public static int dfs(int n) {
		if (n == 0) {
			return 1;
		}
		return n * dfs(n - 1);
	}
}
