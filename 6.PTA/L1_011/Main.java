package L1_011;

import L1_010.scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

/**
 * @author :lujianbin
 * @create :2020-11-12 17:17:00
 * @description :A-B
 * @solution :
 */
public class Main {
	/*   自己想的超时的方法
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			ArrayList<Character> stingA = new ArrayList<>();
			ArrayList<Character> stringB = new ArrayList<>();
			String a = scanner.nextLine();
			String b = scanner.nextLine();
			char[] chara = a.toCharArray();
			char[] charb = b.toCharArray();
			for (int i = 0; i < chara.length; i++) {
				stingA.add(chara[i]);
			}

			for (int i = 0; i < charb.length; i++) {
				stringB.add(charb[i]);
			}

			for (int i = 0; i < stingA.size(); i++) {
				for (int j = 0; j < stringB.size(); j++) {
					if (stingA.get(i) == stringB.get(j)) {
						stingA.remove(i);
					}
				}
			}

			for (Character character : stingA) {
				System.out.println(character);
			}
		}
	*/
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		char[] chars = bf.readLine().toCharArray();
		//适当利用题目当中的限制条件
		char[] cs = new char[10000];
		int a = bf.read(cs);   //将字符填入cs中，并返回char数组的长度
		int[] flag = new int[126];
		for (int i = 0; i < a; i++) {
			flag[cs[i]] = 1;
		}
		for (int i = 0; i < chars.length; i++) {
			if (flag[chars[i]] == 0) {
				System.out.print(chars[i]);
			}
		}
	}
}
