package S_4;

import java.util.Scanner;

/**
 * @author :lujianbin
 * @create :2020-11-19 18:35:00
 * @description :�ھ�ħ��
 * @solution :
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int paper = scanner.nextInt();
		int number = scanner.nextInt();
		int coin = 0;
		int flag = Integer.MIN_VALUE;

		for (int i = 1; i <= number; i++) {
			//ż��ʱ
			if (i % 2 == 0) {
				paper = 2 * coin;
			} else {
				//����ʱ
				coin = paper;
			}
		}

		if (number % 2 == 0) {
			//ֽ��
			flag = 0;
			System.out.println(flag + " " + paper);
		} else {
			//Ӳ��
			flag = 1;
			System.out.println(flag + " " + coin);
		}


	}
}
