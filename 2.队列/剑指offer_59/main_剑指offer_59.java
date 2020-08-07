package 剑指offer_59;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author :lujianbin
 * @create :2020-08-06 14:46:00
 * @description :滑动窗口的最大值，利用双端队列来实现
 */
public class main_剑指offer_59 {          //大小为k的滑动窗口
	public int[] maxSlidingWindow(int[] nums, int k) {

		if (nums == null || nums.length < 1 || k <= 0 || k > nums.length) {
			return new int[0];
		}

		int[] res = new int[nums.length - k + 1];
		//deque双端队列
		Deque<Integer> queue = new LinkedList<>();


		for (int i = 0; i < k; i++) {       //未形成窗口

			while (!queue.isEmpty() && queue.peekLast() < nums[i])   //peekLast查找出最后一个元素
				queue.removeLast(); //当队列不为空且当前队列的最后一个值小于数组值时，返回列表的最后一个元素
			queue.addLast(nums[i]); //在末尾依次添加元素循环比较
		}

		res[0] = queue.peekFirst();     //未形成窗口，则只有一个最大元素

		for (int i = k; i < nums.length; i++) {      //形成窗口后，从k到数组最后
			if (queue.peekFirst() == nums[i - k])
				queue.removeFirst();//从左往右移除并返回第一个元素

			while (!queue.isEmpty() && queue.peekLast() < nums[i])
				queue.removeLast();//移除最后面那个元素，左边那个小则把左边那个移出
			queue.addLast(nums[i]);//移除后把num数组里面的加过来，或者必

			res[i - k + 1] = queue.peekFirst();     //将满足的值接着存入res
		}


		return res;
	}
}