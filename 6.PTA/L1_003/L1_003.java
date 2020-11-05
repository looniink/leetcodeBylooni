package L1_003;

import java.util.Scanner;
import java.lang.String;

/**
 * @author :lujianbin
 * @create :2020-11-04 21:56:00
 * @description :两个数组就很巧妙
 * @solution :
 */
public class L1_003 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		//创建了一个字符类型的数组
		char[] ch = new char[1001];
		int[] arr = new int[1001];
		//将字符串转换成字符数组;
		ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == '0') {
				arr[0]++;
			} else if (ch[i] == '1') {
				arr[1]++;
			} else if (ch[i] == '2') {
				arr[2]++;
			} else if (ch[i] == '3') {
				arr[3]++;
			} else if (ch[i] == '4') {
				arr[4]++;
			} else if (ch[i] == '5') {
				arr[5]++;
			} else if (ch[i] == '6') {
				arr[6]++;
			} else if (ch[i] == '7') {
				arr[7]++;
			} else if (ch[i] == '8') {
				arr[8]++;
			} else if (ch[i] == '9') {
				arr[9]++;
			}


		}
		for (int i = 0; i <= 1000; i++) {
			if (arr[i] != 0) {
				System.out.println(i + ":" + arr[i]);
			}
		}
	}
}
