package leetcode_83;


import leetcode_21.main_21;

/**
 * @author :lujianbin
 * @create :2020-07-26 11:27:00
 * @description :
 */
public class test_83 {
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
		main_83 main_83 = new main_83();
		ListNode listNode = main_83.deleteDuplicates(ln1);
		while (listNode != null) {
			System.out.print(listNode.val + "->");
			listNode = listNode.next;
		}
		System.out.println("null");
	}
}

