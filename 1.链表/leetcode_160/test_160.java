package leetcode_160;


/**
 * @author :lujianbin
 * @create :2020-07-22 13:09:00
 * @description :
 */
public class test_160 {
	public static void main(String[] args) {
		ListNode ln1 = new ListNode();
		ListNode ln2 = new ListNode();
		ListNode ln3 = new ListNode();
		ListNode ln4 = new ListNode();
		ListNode ln5 = new ListNode();
		ListNode ln6 = new ListNode();
		ListNode ln9 = new ListNode();
		ln1.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		ln4.next = ln5;
		ln5.next = ln6;
		ln9.next = ln5;
		ln1.data = 1;
		ln2.data = 2;
		ln3.data = 3;
		ln4.data = 4;
		ln5.data = 5;
		ln6.data = 6;
		ln9.data = 9;
		main_160 main_160 = new main_160();
		ListNode intersectionNode = main_160.getIntersectionNode(ln1, ln9);
		System.out.println(intersectionNode.data);
	}
}
