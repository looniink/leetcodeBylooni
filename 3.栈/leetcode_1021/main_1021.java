package leetcode_1021;

/**
 * @author :lujianbin
 * @create :2020-08-15 10:08:00
 * @description :ɾ������������
 */
public class main_1021 {
	public String removeOuterParentheses(String S) {
		StringBuilder stringBuilder = new StringBuilder();
		int level = 0;
		for (char c : S.toCharArray()) {    //���ַ���ת��Ϊ�ַ�����
			if (c == ')')
				level--;
			if (level >= 1)
				stringBuilder.append(c);    //���ƶ����ַ���׷�ӵ�������
			if (c == '(')
				level++;
		}
		return stringBuilder.toString();    //���ش����������ݵ��ַ�����ʾ��ʽ
	}
}
