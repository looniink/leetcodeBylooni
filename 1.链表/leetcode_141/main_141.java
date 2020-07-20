package leetcode_141;

/**
 * @author :lujianbin
 * @create :2020-07-20 23:17:00
 * @description :给定一个链表，判断链表中是否有环。
 */
public class main_141 {
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) {
			return false;
		}
		ListNode slow = head;
		ListNode fast = head.next;
		//慢指针每次移动一步，快指针移动两步,如果有环他们一定会相遇
		while (slow != fast) {
			if (fast == null || fast.next == null) {  //如果没有环，快指针会先到达尾部
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}


}
