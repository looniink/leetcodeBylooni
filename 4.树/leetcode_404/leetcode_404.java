package leetcode_404;

/**
 * @author :lujianbin
 * @create :2021-01-27 20:01:00
 * @description :计算给定二叉树的所有左叶子之和
 * @solution :先序遍历求所有左叶子节点值之和
 */
public class leetcode_404 {


	public int sumOfLeftLeaves(TreeNode root) {
		int sum = 0;
		//递归结束条件
		if (root == null) {
			return 0;
		}

		//递归期间进行的工作
		//如果左子树是叶子节点则加上当前的值
		if (root.left != null && root.left.left == null && root.left.right == null) {
			sum += root.left.val;
		}

		//右子树递,左子树递归
		return sum + sumOfLeftLeaves(root.right) + sumOfLeftLeaves(root.left);
	}
}
