package ����_0201;


/**
 * @author :lujianbin
 * @create :2020-07-30 20:58:00
 * @description :�Ƴ�δ���������е��ظ�Ԫ��
 */
public class test_0201 {
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
		main_����_0201 main_����_0201 = new main_����_0201();
		ListNode listNode = main_����_0201.removeDuplicateNodes(ln1);
		while (listNode != null) {
			System.out.print(listNode.val + "->");
			listNode = listNode.next;
		}
		System.out.println("null");
	}
}