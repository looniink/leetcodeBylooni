package S_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author :lujianbin
 * @create :2020-11-20 19:48:00
 * @description :
 * @solution :
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		//总共的密码数量
		int n = Integer.parseInt(bf.readLine());
		for (int i = 0; i < n; i++) {
			String s = bf.readLine();
			if (s.length() < 6) {
				System.out.println("Your password is tai duan le.");
				//continue语句的作用是跳过循环体中剩余的语句并到循环末尾而强行执行下一次循环。
				//continue语句只用在for、while、do-while等循环体中, 常与if条件语句一起使用, 用来加速循环。
				continue;      //如果长度不满足，直接开启下一次循环
			} else {
				//善用Boolean变量
				boolean num = false, letter = false, law = true;
				for (int j = 0; j < s.length(); j++) {
					if (!Character.isLetterOrDigit(s.charAt(j)) && s.charAt(j) != '.') {
						//字符不是数字也不是字母，直接退出
						law = false;
						break;
					} else if (Character.isDigit(s.charAt(j))) {
						//字符是数字
						num = true;
					} else if (Character.isLetter(s.charAt(j))) {
						//字符是字母
						letter = true;
					}
				}
				if (!law) {
					System.out.println("Your password is tai luan le.");
				} else if (!letter) {
					System.out.println("Your password needs zi mu.");
				} else if (!num) {
					System.out.println("Your password needs shu zi.");
				} else {
					System.out.println("Your password is wan mei.");
				}
			}
		}
	}
}
