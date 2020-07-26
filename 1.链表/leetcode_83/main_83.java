package leetcode_83;

/**
 * @author :lujianbin
 * @create :2020-07-26 11:25:00
 * @description :删除链表中的重复元素 ：单指针法，递归
 */
public class main_83 {
	//单指针法
	/*public ListNode deleteDuplicates(ListNode head) {
		ListNode cur = head;
		while (cur != null && cur.next != null) {
			if (cur.val == cur.next.val) {
				cur.next = cur.next.next;
			} else {
				cur = cur.next;
			}
		}
		return head;    //cur只是一个指针，head才是节点
	}*/

	//递归方法
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		//如果当前节点不重复则比较下一个节点是否重复
		head.next = deleteDuplicates(head.next);
		//如果值相等则跳过当前节点返回下一个节点(有序链表)
		if (head.val == head.next.val) {
			return head.next;
		}
		return head;
	}
}
