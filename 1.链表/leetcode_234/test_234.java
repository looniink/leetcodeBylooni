package leetcode_234;


/**
 * @author :lujianbin
 * @create :2020-08-02 15:45:00
 * @description :
 */
public class test_234 {
	public static void main(String[] args) {
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(0);
		ListNode ln3 = new ListNode(1);
		ListNode ln4 = new ListNode(0);
		ListNode ln5 = new ListNode(1);
		ListNode ln6 = new ListNode(0);
		ln1.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		ln4.next = ln5;
		ln5.next = ln6;
		ln6.next = null;
		main_234 main_234 = new main_234();
		System.out.println(main_234.isPalindrome(ln1));
	}
}
