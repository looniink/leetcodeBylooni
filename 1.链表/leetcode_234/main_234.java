package leetcode_234;


import java.util.ArrayList;

/**
 * @author :lujianbin
 * @create :2020-08-02 15:43:00
 * @description :�������������͵���һ����
 */
public class main_234 {
	//���뼯��
	public boolean isPalindrome(ListNode head) {
		//������뼯��
		ArrayList<Integer> list = new ArrayList<>();
		ListNode cur = head;
		while (cur != null) {
			list.add(cur.val);
			cur = cur.next;
		}

		//�����߿�ʼ�Ƚ�
		int front = 0;
		int back = list.size() - 1;

		while (front < back) {
			if (!list.get(back).equals(list.get(front))) {      //�Ƚ�integer����ʹ��equals
				return false;
			} else {
				front++;
				back--;
			}
		}
		return true;
	}
}
