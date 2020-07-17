package leetcode_724;

/**
 * @author :lujianbin
 * @create :2020-07-17 21:12:00
 * @description :
 */
public class test_724 {
	public static void main(String[] args) {
		ListNode ln1 = new ListNode();
		ListNode ln2 = new ListNode();
		ListNode ln3 = new ListNode();
		ListNode ln4 = new ListNode();
		ListNode ln5 = new ListNode();
		ln1.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		ln4.next = ln5;
		ln5.next = null;
		ln1.data = 1;
		ln2.data = 2;
		ln3.data = 3;
		ln4.data = 4;
		ln5.data = 5;

		main_724 leetcode_724 = new main_724();
		ListNode kthFromEnd = leetcode_724.getKthFromEnd(ln1, 2);
		System.out.println(kthFromEnd.data);
	}
}
