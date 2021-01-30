package leetcode_501;

import java.util.ArrayList;

/**
 * @author :lujianbin
 * @create :2021-01-30 11:53:00
 * @description :
 * @solution :
 */
public class majorElement {
	public static void main(String[] args) {
		int[] result = {2, 2, 1, 1, 1, 2, 2};
		System.out.println(majorityElement(result));
	}

	//摩尔投票法
	public static int majorityElement(int[] nums) {
		int count = 1;               //计数器设为1
		int res = nums[0];           //假设第一个为众数
		for (int i = 1; i < nums.length; i++) {     //比较下一个数和此数是否相等
			if (count == 0) {   //如果count为0，说明不是候选者的数字个数已经和候选者个数相同，则将下一个值设为候选众数
				res = nums[i];
			} else if (res == nums[i]) {
				count++;        //若相等则计数器+1
			} else {
				count--;        //否则计数器-1
			}
		}
		return res;
	}


}
