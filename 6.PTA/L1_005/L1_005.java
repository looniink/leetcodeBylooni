package L1_005;


import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * @author :lujianbin
 * @create :2020-11-07 16:32:00
 * @description :������λ��
 * @solution :��ʱ����
 */
public class L1_005 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//���뿼������
		int sum = scanner.nextInt();

		//�Ի���λ�ţ�׼��֤��map
		LinkedHashMap<Integer, String> integerStringLinkedHashMap = new LinkedHashMap<>();

		//�Ի���λ�ţ�������λ��
		LinkedHashMap<Integer, Integer> integerIntegerLinkedHashMap = new LinkedHashMap<>();
		for (int i = 0; i < sum; i++) {
			//����׼��֤��
			String s = scanner.next();
			//�����Ի���λ��
			int testNumber = scanner.nextInt();
			//���뿼����λ��
			int examNumber = scanner.nextInt();
			integerStringLinkedHashMap.put(testNumber, s);
			integerIntegerLinkedHashMap.put(testNumber, examNumber);
		}

		//������Ҫ��ѯ������λ�ŵ�ѧ���ĸ���
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			//�����Ի���λ�ţ��ֱ��Ӧ����map,��ѯ��׼��֤���뿼����λ��
			int testSeat = scanner.nextInt();
			System.out.println(integerStringLinkedHashMap.get(testSeat) + " " + integerIntegerLinkedHashMap.get(testSeat));
		}
	}
}
