package L1_022;

import java.util.Scanner;

/**
 * @author :lujianbin
 * @create :2020-11-15 16:35:00
 * @description :
 * @solution :
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int j = 0;
		int o = 0;
		for (int i = 0; i < n; i++)
			//可以直接判断该数值
			if (sc.nextInt() % 2 == 0)
				o++;
			else
				j++;
		System.out.println(j + " " + o);
	}
}
