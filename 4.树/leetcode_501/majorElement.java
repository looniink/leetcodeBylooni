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

	//Ħ��ͶƱ��
	public static int majorityElement(int[] nums) {
		int count = 1;               //��������Ϊ1
		int res = nums[0];           //�����һ��Ϊ����
		for (int i = 1; i < nums.length; i++) {     //�Ƚ���һ�����ʹ����Ƿ����
			if (count == 0) {   //���countΪ0��˵�����Ǻ�ѡ�ߵ����ָ����Ѿ��ͺ�ѡ�߸�����ͬ������һ��ֵ��Ϊ��ѡ����
				res = nums[i];
			} else if (res == nums[i]) {
				count++;        //������������+1
			} else {
				count--;        //���������-1
			}
		}
		return res;
	}


}
