package leetcode_21;

/**
 * @author :lujianbin
 * @create :2020-07-24 14:56:00
 * @description :合并两个有序链表
 */
public class main_21 {
	//递归解法:：我们判断 l1 和 l2 头结点哪个更小，然后较小结点的 next 指针指向其余结点的合并结果。（调用递归）
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		//当比较时任意一个为空时则直接合并
		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		} else if (l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);       //如果l1较小则存入l1，并将l1的下一个节点与l2进行比较
			return l1;
		} else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;                                  //如果类l2较小则存入l2,并将l2的下一个节点与l1进行比较
		}
	}
}
