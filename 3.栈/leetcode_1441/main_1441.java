package leetcode_1441;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author :lujianbin
 * @create :2020-08-17 11:03:00
 * @description :用栈操作构建数组
 */
public class main_1441 {
	public List<String> buildArray(int[] target, int n) {
		List<String> list = new LinkedList<>();
		int pos = 0;
		for (int i = 1; i <= n; i++) {
			if (target[pos] == i) {
				//相等则直接push
				list.add("Push");
				if (++pos >= target.length) {
					break;
				}
			} else {
				//不相等则先push再pop
				list.add("Push");
				list.add("Pop");
			}
		}
		return list;
	}
}
