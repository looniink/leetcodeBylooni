package L1_002;

import java.util.Scanner;

/**
 * @author :lujianbin
 * @create :2020-11-01 17:05:00
 * @description :�������ķ����޸ĳ�ɳ©��״
 * @solution :
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//������ܸ���
		int n = sc.nextInt();
		String symbol = sc.next();
		int k = 0;       // ��¼��ǰ����

		for (int i = 1; i <= 45; i++) { // ����Ŀ������������45��
			int total = 0;
			for (int j = 1; j <= i; j++) { // ���㵥���������������
				total += j * 2 - 1;
			}
			total = total * 2 - 1; // �ܸ���
			if (total > n) {
				k = i - 1;
				break;
			}
		}


		// ����ͺͶ�һ���ˡ�
		int row = 2 * k - 1; // ��k��ͼ�ε�һ����2k-1�С���һ�и���Ϊ:2k-1��


		// ��ӡ������(��������*)
		String line;
		for (int i = 0; i < row / 2; i++) {
			line = "";
			for (int j = 0; j < i; j++)  // ��ӡÿ�пհ���
			{
				line += " ";
			}
			for (int j = 0; j < row - (i * 2); j++) // ��ӡÿ�з�����
			{
				line += symbol;
			}
			System.out.println(line);
		}


		// ��ӡ������
		int row2 = row / 2 + 1;
		for (int i = 0; i < row2; i++) {
			line = "";
			for (int j = 0; j < row2 - i - 1; j++)  // ��ӡÿ�пհ���
			{
				line += " ";
			}
			for (int j = 0; j < i * 2 + 1; j++) // ��ӡÿ�з�����
			{
				line += symbol;
			}
			System.out.println(line);
		}

		//ʣ��ķ�����
		System.out.print(n - ((k * k) * 2 - 1));
	}
}
