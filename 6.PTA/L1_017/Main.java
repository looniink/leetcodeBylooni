package L1_017;

import java.util.Scanner;

/**
 * @author :lujianbin
 * @create :2020-11-15 16:15:00
 * @description :L1-017 �����ж�� (15��)
 * @solution :
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		boolean f = false;
		boolean o = false;
		double c = 0.0;
		double res;
		//�жϸ���
		if (a.charAt(0) == '-')
			f = true;

		//�ж��Ƿ�Ϊż��
		if ((a.charAt(a.length() - 1) - '0') % 2 == 0) {
			o = true;
		}

		//�ж�2�ĸ���
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '2')
				c++;
		}

		if (f)
			//������������ٳ�һ��
			res = c / (a.length() - 1) * 1.5;
		else
			//�����������Ⱦ���
			res = c / (a.length());
		//���Ϊż����������1��
		if (o)
			res *= 2;

		res *= 100;
		System.out.printf("%.2f", res);
		System.out.println("%");
	}
}
