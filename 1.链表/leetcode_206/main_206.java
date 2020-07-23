package leetcode_206;

import java.util.List;

/**
 * @author :lujianbin
 * @create :2020-07-23 13:42:00
 * @description :��ת����
 */
public class main_206 {
	//��������ת����
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode pre = null;
		ListNode temp = null;
		ListNode cur = head;
		while (cur != null) {
			temp = cur.next;
			cur.next = pre;       //�ı�ָ���λ�ôﵽ��ת�����Ŀ��
			pre = cur;
			cur = temp;
		}
		return pre;
	}
}
