package leetcode_206;

import java.util.List;

/**
 * @author :lujianbin
 * @create :2020-07-23 13:42:00
 * @description :反转链表
 */
public class main_206 {
	//迭代法反转链表
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode pre = null;
		ListNode temp = null;
		ListNode cur = head;
		while (cur != null) {
			temp = cur.next;
			cur.next = pre;       //改变指针的位置达到反转链表的目的
			pre = cur;
			cur = temp;
		}
		return pre;
	}
}
