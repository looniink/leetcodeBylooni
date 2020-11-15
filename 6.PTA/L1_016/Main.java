package L1_016;

import java.util.Scanner;

/**
 * @author :lujianbin
 * @create :2020-11-13 20:19:00
 * @description :
 * @solution :
 */


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//搜索数组
		char[] M = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
		//权重数组
		int[] numbers = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2, 1};
		int n = sc.nextInt();
		sc.nextLine();
		String[] str = new String[n];
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			str[i] = sc.nextLine();
		}

		loop:
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < 17; j++) {
				//如果不满足数字条件，直接打印然后重头开始
				if (str[i].charAt(j) < '0' || str[i].charAt(j) > '9') {
					System.out.println(str[i]);
					flag = false;
					continue loop;  //避免身份证号和验证码都错误的情况下重复打印
				}
				sum += (str[i].charAt(j) - '0') * numbers[j];

			}
			if (M[sum % 11] != str[i].charAt(17)) {
				System.out.println(str[i]);
				flag = false;
			}

		}

		if (flag)
			System.out.println("All passed");

	}
}
