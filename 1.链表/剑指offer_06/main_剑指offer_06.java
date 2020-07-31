package 剑指offer_06;

import java.util.ArrayList;

/**
 * @author :lujianbin
 * @create :2020-07-31 11:07:00
 * @description :从尾到头打印链表
 */
public class main_剑指offer_06 {
	public int[] reversePrint(ListNode head) {
		ArrayList<Integer> list = new ArrayList<>();
		while (head != null) {
			list.add(head.val);
			head = head.next;
		}
		int size = list.size();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = list.get(size - 1 - i);
		}
		return array;
	}
}
