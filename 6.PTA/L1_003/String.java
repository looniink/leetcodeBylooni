package L1_003;

import java.util.Scanner;

/**
 * @author :lujianbin
 * @create :2020-11-04 20:44:00
 * @description :�ַ���
 * @solution :
 */
public class String {
	public static void main(java.lang.String[] args) {
		Scanner scanner = new Scanner(System.in);
		java.lang.String s = scanner.nextLine();
		char[] chars = s.toCharArray();
		System.out.println(s.charAt(3));        //�ַ�����0��ʼ
		System.out.println(s.contains("l"));    //�ж����Ƿ����
		System.out.println(s.endsWith("x"));    //�ж��Ƿ���n��β��start withͬ��
		System.out.println(s.replaceAll("l", "-----")); //�滻�������ݣ�replace first����
		System.out.println(s.substring(1, 2));  //ָ����ȡ����
		System.out.println(s.trim());           //ȥ�����еĿո�
		System.out.println(s.toUpperCase() + "+++++++++++++" + s.toLowerCase());    //ת��Сд

		//stringBuffer�̰߳�ȫ, ����sb�������޸�����(append)
		StringBuilder s2 = new StringBuilder(s);
		//CRUD
		System.out.println(s2.append("hello"));
		System.out.println(s2.deleteCharAt(1));
		System.out.println(s2.insert(1, "���"));
		System.out.println(s2.reverse());

	}
}
