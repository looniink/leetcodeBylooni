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
		//快慢指针法，使用两个指针变量，刚开始都位于链表的第1个结点,一个永远一次只走1步,一个永远一次只走2步,一个在前,一个在后,同时走。
		//这样当快指针走完的时候，慢指针就来到了链表的中间位置
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
}
