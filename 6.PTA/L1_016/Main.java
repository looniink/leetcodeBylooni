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
		//��������
		char[] M = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
		//Ȩ������
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
				//�������������������ֱ�Ӵ�ӡȻ����ͷ��ʼ
				if (str[i].charAt(j) < '0' || str[i].charAt(j) > '9') {
					System.out.println(str[i]);
					flag = false;
					continue loop;  //�������֤�ź���֤�붼�����������ظ���ӡ
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
