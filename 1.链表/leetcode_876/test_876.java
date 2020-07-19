package leetcode_876;

/**
 * @author :lujianbin
 * @create :2020-07-19 11:39:00
 * @description :
 */
public class test_876 {
	public static void main(String[] args) {
		ListNode ln1 = new ListNode();
		ListNode ln2 = new ListNode();
		ListNode ln3 = new ListNode();
		ListNode ln4 = new ListNode();
		ListNode ln5 = new ListNode();
		ListNode ln6 = new ListNode();
		ln1.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		ln4.next = ln5;
		ln5.next = ln6;
		ln6.next = null;
		ln1.data = 1;
		ln2.data = 2;
		ln3.data = 3;
		ln4.data = 4;
		ln5.data = 5;
		ln6.data = 6;
		main_876 main_876 = new main_876();
		ListNode listNode = main_876.middleNode(ln1);
		System.out.println(listNode.data);
	}
}
