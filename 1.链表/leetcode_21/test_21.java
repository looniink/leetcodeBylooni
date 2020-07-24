package leetcode_21;


/**
 * @author :lujianbin
 * @create :2020-07-24 15:44:00
 * @description :
 */
public class test_21 {
	public static void main(String[] args) {
		ListNode ln1 = new ListNode();
		ListNode ln2 = new ListNode();
		ListNode ln3 = new ListNode();
		ListNode ln5 = new ListNode();
		ListNode ln6 = new ListNode();
		ListNode ln7 = new ListNode();
		ln1.next = ln2;
		ln2.next = ln3;
		ln5.next = ln6;
		ln6.next = ln7;
		ln1.val = 1;
		ln2.val = 2;
		ln3.val = 4;
		ln5.val = 1;
		ln6.val = 3;
		ln7.val = 4;
		main_21 main_21 = new main_21();
		ListNode listNode = main_21.mergeTwoLists(ln1, ln5);
		while (listNode != null) {
			System.out.print(listNode.val + "->");
			listNode = listNode.next;
		}
		System.out.println("null");
	}
}

