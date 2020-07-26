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
		if (head.val == head.next.val) {
			ListNode node = head.next;//当前开始重复的节点用head标记
			while (node != null && node.val == head.val) {
				node = node.next;
			}
			//一直寻找与第一个重复的节点，如果有重复的就递归一直跳过(已经排好序的链表)
			//循环出来以后node指向下一个不重复的点，下一步从这个节点开始继续查找重复的节点
			return deleteDuplicates(node);
		} else {
			//如果这个节点和下一个节点不重复，则继续从下一个节点开始找重复的
			head.next = deleteDuplicates(head.next);
			return head;
		}
	}


}
