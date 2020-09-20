package 面试金典_0402;

import java.util.Arrays;

/**
 * @author :lujianbin
 * @create :2020-09-20 12:08:00
 * @description :传入数组构建 高度最小二叉搜索树
 */
public class main_面试经典0402 {
	//左右子树的节点个数应该尽可能的接近，才能保持高度最小
	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums.length == 0) return null;
		//最小高度树的根节点为数组最中间的那个值
		TreeNode n = new TreeNode(nums[nums.length / 2]);
		//利用递归方法，使用cooyOfRange方法，将0-length/2放到左子树
		n.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, nums.length / 2));
		//利用递归方法，使用cooyOfRange方法，将length/2+1放到右子树
		n.right = sortedArrayToBST(Arrays.copyOfRange(nums, nums.length / 2 + 1, nums.length));
		return n;
	}
}
