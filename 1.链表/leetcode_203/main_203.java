package leetcode_203;

import java.util.List;

/**
 * @author :lujianbin
 * @create :2020-07-25 10:37:00
 * @description :删除链表中的重复元素
 */
public class main_203 {
	//采用虚拟头结点的方式删除元素(哨兵 )
	public ListNode removeElements(ListNode head, int val) {
		if (head == null) {
			return null;
		}
		//创建一个节点,next指向head节点
		ListNode node = new ListNode(0);
		node.next = head;
		//定义双指针分别指向前一个节点和当前节点
		ListNode pre = node;
		ListNode cur = head;
		while (cur != null) {
			if (cur.val == val) {
				//如果值相等则移除该节点
				pre.next = cur.next;
			} else {
				//将当前指针位置复制给前一个指针
				pre = cur;
			}
			//将当前直至移向下一个位置
			cur = cur.next;
		}
		return node.next;
	}
}
