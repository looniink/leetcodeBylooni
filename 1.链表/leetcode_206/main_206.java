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
		while (cur != null) {     //当cur到达尾部时退出循环，链表反转完成
			temp = cur.next;      //预存cur.next节点
			cur.next = pre;       //改变指针的位置达到反转链表的目的
			pre = cur;            //反转指针后将pre指向下一个cur节点
			cur = temp;           //cur指向下一个节点
		}
		return pre;
	}
}
