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
		if (head.val == head.next.val) {
			ListNode node = head.next;//��ǰ��ʼ�ظ��Ľڵ���head���
			while (node != null && node.val == head.val) {
				node = node.next;
			}
			//һֱѰ�����һ���ظ��Ľڵ㣬������ظ��ľ͵ݹ�һֱ����(�Ѿ��ź��������)
			//ѭ�������Ժ�nodeָ����һ�����ظ��ĵ㣬��һ��������ڵ㿪ʼ���������ظ��Ľڵ�
			return deleteDuplicates(node);
		} else {
			//�������ڵ����һ���ڵ㲻�ظ������������һ���ڵ㿪ʼ���ظ���
			head.next = deleteDuplicates(head.next);
			return head;
		}
	}


}
