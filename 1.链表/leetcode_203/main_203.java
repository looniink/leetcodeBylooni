package leetcode_203;

import java.util.List;

/**
 * @author :lujianbin
 * @create :2020-07-25 10:37:00
 * @description :ɾ�������е��ظ�Ԫ��
 */
public class main_203 {
	//��������ͷ���ķ�ʽɾ��Ԫ��(�ڱ� )
	public ListNode removeElements(ListNode head, int val) {
		if (head == null) {
			return null;
		}
		//����һ���ڵ�,nextָ��head�ڵ�
		ListNode node = new ListNode(0);
		node.next = head;
		//����˫ָ��ֱ�ָ��ǰһ���ڵ�͵�ǰ�ڵ�
		ListNode pre = node;
		ListNode cur = head;
		while (cur != null) {
			if (cur.val == val) {
				//���ֵ������Ƴ��ýڵ�
				pre.next = cur.next;
			} else {
				//����ǰָ��λ�ø��Ƹ�ǰһ��ָ��
				pre = cur;
			}
			//����ǰֱ��������һ��λ��
			cur = cur.next;
		}
		return node.next;
	}
}
