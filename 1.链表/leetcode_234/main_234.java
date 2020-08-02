package leetcode_234;


import java.util.ArrayList;

/**
 * @author :lujianbin
 * @create :2020-08-02 15:43:00
 * @description :回文链（正读和倒读一样）
 */
public class main_234 {
	//放入集合
	public boolean isPalindrome(ListNode head) {
		//将其放入集合
		ArrayList<Integer> list = new ArrayList<>();
		ListNode cur = head;
		while (cur != null) {
			list.add(cur.val);
			cur = cur.next;
		}

		//从两边开始比较
		int front = 0;
		int back = list.size() - 1;

		while (front < back) {
			if (!list.get(back).equals(list.get(front))) {      //比较integer必须使用equals
				return false;
			} else {
				front++;
				back--;
			}
		}
		return true;
	}
}
