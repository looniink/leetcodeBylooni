package leetcode_203;


/**
 * @author :lujianbin
 * @create :2020-07-25 11:02:00
 * @description :
 */
public class test_203 {
	public static void main(String[] args) {
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(2);
		ListNode ln3 = new ListNode(6);
		ListNode ln4 = new ListNode(3);
		ListNode ln5 = new ListNode(4);
		ListNode ln6 = new ListNode(5);
		ListNode ln7 = new ListNode(6);
		ln1.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		ln4.next = ln5;
		ln5.next = ln6;
		ln6.next = ln7;
		ln7.next = null;
		main_203 main_203 = new main_203();
		ListNode listNode = main_203.removeElements(ln1, 6);
		while (listNode != null) {
			System.out.print(listNode.val + "->");
			listNode = listNode.next;
		}
		System.out.println("null");
	}
}
