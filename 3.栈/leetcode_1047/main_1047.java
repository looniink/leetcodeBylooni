package leetcode_1047;

/**
 * @author :lujianbin
 * @create :2020-08-16 18:43:00
 * @description :ɾ���ַ��������ڵ��ظ���
 */
public class main_1047 {
	//stringbuffer�������
	public String removeDuplicates(String S) {
		StringBuffer res = new StringBuffer();
		int size = 0;
		for (int i = 0; i < S.length(); i++) {
			//���������ͬ�ͽ�res�����Ԫ��
			if (size != 0 && res.charAt(size - 1) == S.charAt(i))
				res.deleteCharAt(--size);
			else {
				//���û���ظ����򽫸�Ԫ��׷�ӵ�res��
				res.append(S.charAt(i));
				size++;
			}
		}
		return res.toString();
	}
}
