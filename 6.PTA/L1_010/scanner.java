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
		//����������
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		//����ָ���ĸ�ʽ����ַ���
		String[] split = s.split(" ");
		for (String s1 : split) {
			//���ַ���ת��Ϊ����
			System.out.print(Integer.parseInt(s1));
		}
	}
}
