package ���Խ��_0402;

import java.util.Arrays;

/**
 * @author :lujianbin
 * @create :2020-09-20 12:08:00
 * @description :�������鹹�� �߶���С����������
 */
public class main_���Ծ���0402 {
	//���������Ľڵ����Ӧ�þ����ܵĽӽ������ܱ��ָ߶���С
	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums.length == 0) return null;
		//��С�߶����ĸ��ڵ�Ϊ�������м���Ǹ�ֵ
		TreeNode n = new TreeNode(nums[nums.length / 2]);
		//���õݹ鷽����ʹ��cooyOfRange��������0-length/2�ŵ�������
		n.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, nums.length / 2));
		//���õݹ鷽����ʹ��cooyOfRange��������length/2+1�ŵ�������
		n.right = sortedArrayToBST(Arrays.copyOfRange(nums, nums.length / 2 + 1, nums.length));
		return n;
	}
}
