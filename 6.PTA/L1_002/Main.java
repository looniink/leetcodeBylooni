package L1_002;

import java.util.Scanner;

/**
 * @author :lujianbin
 * @create :2020-11-01 17:05:00
 * @description :将给定的符号修改成沙漏形状
 * @solution :
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//输入的总个数
		int n = sc.nextInt();
		String symbol = sc.next();
		int k = 0;       // 记录当前行数

		for (int i = 1; i <= 45; i++) { // 由题目限制算出最多有45行
			int total = 0;
			for (int j = 1; j <= i; j++) { // 计算单个三角形所需个数
				total += j * 2 - 1;
			}
			total = total * 2 - 1; // 总个数
			if (total > n) {
				k = i - 1;
				break;
			}
		}


		// 下面就和都一样了。
		int row = 2 * k - 1; // 第k个图形的一共有2k-1行。第一行个数为:2k-1。


		// 打印倒三角(不带单个*)
		String line;
		for (int i = 0; i < row / 2; i++) {
			line = "";
			for (int j = 0; j < i; j++)  // 打印每行空白数
			{
				line += " ";
			}
			for (int j = 0; j < row - (i * 2); j++) // 打印每行符号数
			{
				line += symbol;
			}
			System.out.println(line);
		}


		// 打印正三角
		int row2 = row / 2 + 1;
		for (int i = 0; i < row2; i++) {
			line = "";
			for (int j = 0; j < row2 - i - 1; j++)  // 打印每行空白数
			{
				line += " ";
			}
			for (int j = 0; j < i * 2 + 1; j++) // 打印每行符号数
			{
				line += symbol;
			}
			System.out.println(line);
		}

		//剩余的符号数
		System.out.print(n - ((k * k) * 2 - 1));
	}
}
