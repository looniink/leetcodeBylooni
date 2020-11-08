package L1_006;

import java.util.Scanner;

/**
 * @author :lujianbin
 * @create :2020-11-07 21:05:00
 * @description :��������
 * @solution :
 */
public class L1_006 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//��������
		long n = scanner.nextInt();

		long sum = 0;
		long len = 0;                //��¼�������ӵĸ���
		long start = 0;

		for (int i = 2; i < Math.sqrt(n); i++) {
			sum = 1;
			for (int j = i; sum * i <= n; j++) {    //����ģ��
				sum *= j;
				if (n % sum == 0 && j - i + 1 > len) {
					start = i;
					len = j - i + 1;
				}
			}
		}

		//�����Ĵ���
		if (start == 0) {
			start = n;
			len = 1;
		}

		//��ӡ�������ӵĸ���
		System.out.println(len);
		for (int i = 0; i < len - 1; i++) {
			System.out.print(start + i + "*");
		}
		System.out.println(start + len - 1);
	}
}
