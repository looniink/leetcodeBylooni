package leetcode_496;


import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author :lujianbin
 * @create :2020-08-11 12:32:00
 * @description :下一个更大元素
 */
public class main_496 {
	//一般普通解法
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] res = new int[nums1.length];
		//遍历nums1
		for (int i = 0; i < nums1.length; i++) {
			//寻找num1中的数字在nums2中的位置
			int j = 0;        //存储位置
			for (; j < nums2.length; j++) {
				if (nums2[j] == nums1[i]) {
					break;
				}
			}
			//找到位置后再向后寻找比其大的数
			while (j < nums2.length) {
				if (nums2[j] > nums1[i]) {
					res[i] = nums2[j];      //如果找到比它大的存在结果中
					break;                  //退出继续下一个数的比较
				} else {
					j++;                    //一个一个往后寻找
				}
			}
			//如果没有找到则该位置等于-1
			if (j == nums2.length)
				res[i] = -1;
		}
		return res;         //最后返回数组
	}

	//hashmap映射和单调栈来解决
	//我们可以忽略数组 nums1，先对将 nums2 中的每一个元素，求出其下一个更大的元素。
	// 随后对于将这些答案放入哈希映射（HashMap）中，再遍历数组 nums1，并直接找出答案
	public int[] nextGreaterElement2(int[] findNums, int[] nums) {
		Deque<Integer> deque = new LinkedList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] res = new int[findNums.length];

		for (int i = 0; i < nums.length; i++) {
			while (!deque.isEmpty() && nums[i] > deque.peek())
				map.put(deque.pop(), nums[i]);      //如果后面那个大，则将对应的两个值放入hash表中
			deque.push(nums[i]);
		}
		while (!deque.isEmpty()) {
			map.put(deque.pop(), -1);       //最后一个对应-1
		}

		for (int i = 0; i < findNums.length; i++) {
			res[i] = map.get(findNums[i]);      //从hash表中取出对应的值
		}
		return res;
	}


}
