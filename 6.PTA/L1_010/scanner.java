package L1_010;

import java.util.Scanner;

/**
 * @author :lujianbin
 * @create :2020-11-12 16:14:00
 * @description :
 * @solution :
 */
public class scanner {
	public static void main(String[] args) {
		//输入多个整数
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		//按照指定的格式拆分字符串
		String[] split = s.split(" ");
		for (String s1 : split) {
			//将字符串转化为数组
			System.out.print(Integer.parseInt(s1));
		}
	}
}
