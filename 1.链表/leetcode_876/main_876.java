package leetcode_876;

/**
 * @author :lujianbin
 * @create :2020-07-19 11:22:00
 * @description :������м�ڵ�
 */
public class main_876 {
	//��������м�ڵ�
	public ListNode middleNode(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
}
