package L1_007;

import java.util.Scanner;

/**
 * @author :lujianbin
 * @create :2020-11-08 15:19:00
 * @description :
 * @solution :
 */
public class L1_007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] arr = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};//����

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {//�ж��Ƿ�Ϊ����
				System.out.print(arr[s.charAt(i) - '0'] + " ");
			} else {
				System.out.print("fu ");
			}
		}
		System.out.println(arr[s.charAt(s.length() - 1) - '0']);//�������Ŀո�����
	}

}
