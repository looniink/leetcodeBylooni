package leetcode_141;

/**
 * @author :lujianbin
 * @create :2020-07-20 23:17:00
 * @description :����һ�������ж��������Ƿ��л���
 */
public class main_141 {
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) {
			return false;
		}
		ListNode slow = head;
		ListNode fast = head.next;
		//��ָ��ÿ���ƶ�һ������ָ���ƶ�����,����л�����һ��������
		while (slow != fast) {
			if (fast == null || fast.next == null) {  //���û�л�����ָ����ȵ���β��
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}


}
