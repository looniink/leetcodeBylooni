package leetcode_160;

/**
 * @author :lujianbin
 * @create :2020-07-22 09:22:00
 * @description :找到两个单链表相交的起始节点。
 * @solution :A和B两个链表长度可能不同，但是A+B和B+A的长度是相同的，所以遍历A+B和遍历B+A一定是同时结束。
 * 如果A,B相交的话A和B有一段尾巴是相同的，所以两个遍历的指针一定会同时到达交点 如果A,B不相交的话两个指针就会同时到达A+B（B+A）的尾节点
 */
public class main_160 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		if (headA == null || headB == null) {
			return null;
		}
		ListNode nodeA = headA;     //nodeA指向A链表的头部
		ListNode nodeB = headB;     //nodeB指向B链表的头部
		while (nodeA != nodeB) {    //如果没有指向同一节点，则进入循环
			nodeA = nodeA == null ? headB : nodeA.next;     //如果nodeA是null值则将其指向nodeB否则指向下一个节点
			nodeB = nodeB == null ? headA : nodeB.next;     //如果nodeB是null值则将其指向nodeA否则指向下一个节点
		}
		return nodeA;
	}
}
