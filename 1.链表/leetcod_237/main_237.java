package leetcod_237;

/**
 * @author :lujianbin
 * @create :2020-07-27 12:43:00
 * @description : 删除链表中的节点
 */
public class main_237 {
	//给定某个节点，删除它。
	public void deleteNode(ListNode node) {
		node.val = node.next.val;     //将该节点后面的值赋值给该节点
		node.next = node.next.next;   //将下一个节点的值赋值给当前节点过后再将指针指向下下个节点，从而删除该节点的下一个节点
	}
}
