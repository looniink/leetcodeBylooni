package leetcode_1290;


/**
 * @author :lujianbin
 * @create :2020-08-01 23:36:00
 * @description :
 */
public class test_1290 {
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
		main_1290 main_1290 = new main_1290();
		System.out.println(main_1290.getDecimalValue(ln1));
	}
}
