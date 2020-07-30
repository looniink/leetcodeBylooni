package 面试_0201;


/**
 * @author :lujianbin
 * @create :2020-07-30 20:58:00
 * @description :移除未排序链表中的重复元素
 */
public class test_0201 {
	public static void main(String[] args) {
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(3);
		ListNode ln3 = new ListNode(4);
		ListNode ln5 = new ListNode(1);
		ListNode ln6 = new ListNode(3);
		ListNode ln7 = new ListNode(4);
		ln1.next = ln2;
		ln2.next = ln3;
		ln5.next = ln6;
		ln6.next = ln7;
		main_面试_0201 main_面试_0201 = new main_面试_0201();
		ListNode listNode = main_面试_0201.removeDuplicateNodes(ln1);
		while (listNode != null) {
			System.out.print(listNode.val + "->");
			listNode = listNode.next;
		}
		System.out.println("null");
	}
}