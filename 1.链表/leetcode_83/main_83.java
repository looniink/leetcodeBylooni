package leetcode_83;

/**
 * @author :lujianbin
 * @create :2020-07-26 11:25:00
 * @description :ɾ�������е��ظ�Ԫ�� ����ָ�뷨���ݹ�
 */
public class main_83 {
	//��ָ�뷨
	/*public ListNode deleteDuplicates(ListNode head) {
		ListNode cur = head;
		while (cur != null && cur.next != null) {
			if (cur.val == cur.next.val) {
				cur.next = cur.next.next;
			} else {
				cur = cur.next;
			}
		}
		return head;    //curֻ��һ��ָ�룬head���ǽڵ�
	}*/

	//�ݹ鷽��
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		//�����ǰ�ڵ㲻�ظ���Ƚ���һ���ڵ��Ƿ��ظ�
		head.next = deleteDuplicates(head.next);
		//���ֵ�����������ǰ�ڵ㷵����һ���ڵ�(��������)
		if (head.val == head.next.val) {
			return head.next;
		}
		return head;
	}
}
