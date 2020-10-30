package leetcode_101;

/**
 * @author :lujianbin
 * @create :2020-10-30 21:31:00
 * @description :给定一个二叉树，检查它是否是镜像对称的。
 * @solution :检查单个树的左右子树是否对称再递归
 */
public class leetcode_101 {
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}

		return dfs(root.left, root.right);
	}

	public boolean dfs(TreeNode left, TreeNode right) {
		//如果两个子树都为空肯定对称
		if (left == null && right == null) {
			return true;
		}
		//两个节点中出现一个节点为空则肯定不对称
		if (left == null || right == null) {
			return false;
		}

		//或者两个节点的值不相等
		if (left.val != right.val) {
			return false;
		}

		//否则递归比较 左子树则左子树和右子树的右子树是否相等 &&左子树的右子树和右子树的左子树是否相等
		return dfs(left.left, right.right) && dfs(left.right, right.left);

	}
}
