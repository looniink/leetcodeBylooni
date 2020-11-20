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
		//�ܹ�����������
		int n = Integer.parseInt(bf.readLine());
		for (int i = 0; i < n; i++) {
			String s = bf.readLine();
			if (s.length() < 6) {
				System.out.println("Your password is tai duan le.");
				//continue��������������ѭ������ʣ�����䲢��ѭ��ĩβ��ǿ��ִ����һ��ѭ����
				//continue���ֻ����for��while��do-while��ѭ������, ����if�������һ��ʹ��, ��������ѭ����
				continue;      //������Ȳ����㣬ֱ�ӿ�����һ��ѭ��
			} else {
				//����Boolean����
				boolean num = false, letter = false, law = true;
				for (int j = 0; j < s.length(); j++) {
					if (!Character.isLetterOrDigit(s.charAt(j)) && s.charAt(j) != '.') {
						//�ַ���������Ҳ������ĸ��ֱ���˳�
						law = false;
						break;
					} else if (Character.isDigit(s.charAt(j))) {
						//�ַ�������
						num = true;
					} else if (Character.isLetter(s.charAt(j))) {
						//�ַ�����ĸ
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
