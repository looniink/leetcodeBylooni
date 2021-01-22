package leetcode_111;

/**
 * @author :lujianbin
 * @create :2021-01-22 12:24:00
 * @description :二叉树的最小深度
 * @solution :采用dfs递归的方法
 */
public class leetcode_111 {

	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		//递归的结束条件
		if (root.left == null && root.right == null) {
			return 1;
		}

		//左右子树递归
		int left = minDepth(root.left);
		int right = minDepth(root.right);

		//左子树为空或者右子树为空时
		if (root.left == null || root.right == null) {
			return left + right + 1;
		}

		//当左右子树都不为空的时候
		return Math.min(left, right) + 1;
	}
}
