package leetcod_237;


/**
 * @author :lujianbin
 * @create :2020-07-27 12:43:00
 * @description :
 */
public class test_237 {
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
		//没有删除节点前打印
		while (ln1 != null) {
			System.out.print(ln1.val + "->");
			ln1 = ln1.next;
		}
		System.out.println("null");


		main_237 main_237 = new main_237();
		main_237.deleteNode(ln4);

	}
}
