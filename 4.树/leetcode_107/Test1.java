package leetcode_107;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author :lujianbin
 * @create :2020-08-25 22:38:00
 * @description :集合实现倒序
 */
public class Test1 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		//   Collections.reverse(list1);   reverse方法可以直接逆序
		//每次加到第一个位置实现倒序
		list2.add(0, 1);
		list2.add(0, 2);
		list2.add(0, 3);
		list2.add(0, 4);
		list2.add(0, 5);

		System.out.println(list1);
		System.out.println(list2);

	}
}
