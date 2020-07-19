package leetcode_876;

/**
 * @author :lujianbin
 * @create :2020-07-19 11:22:00
 * @description :链表的中间节点
 */
public class main_876 {
	//求链表的中间节点
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
