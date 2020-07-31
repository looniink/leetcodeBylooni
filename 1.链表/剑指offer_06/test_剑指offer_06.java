package 剑指offer_06;


/**
 * @author :lujianbin
 * @create :2020-07-31 11:08:00
 * @description :
 */
public class test_剑指offer_06 {
	public static void main(String[] args) {
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(2);
		ListNode ln3 = new ListNode(3);
		ListNode ln4 = new ListNode(4);
		ListNode ln5 = new ListNode(5);
		ListNode ln6 = new ListNode(6);
		ln1.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		ln4.next = ln5;
		ln5.next = ln6;
		ln6.next = null;
		main_剑指offer_06 main_剑指offer_06 = new main_剑指offer_06();
		int[] array = main_剑指offer_06.reversePrint(ln1);
		for (int value : array) {
			System.out.print(value + "->");
		}
		System.out.println("null");
	}
}
