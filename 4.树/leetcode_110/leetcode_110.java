package leetcode_110;

import java.awt.dnd.DragSource;

/**
 * @author :lujianbin
 * @create :2020-10-31 20:54:00
 * @description :给定一个二叉树，判断它是否是高度平衡的二叉树
 */
public class leetcode_110 {
	boolean flag = true;

	public boolean isBalanced(TreeNode root) {
		//dfs判断是否平衡
		dfs(root);
		return flag;
	}

	public int dfs(TreeNode root) {
		if (root == null) {
			return 0;
		}

		//左右子树的最大深度
		int left = dfs(root.left) + 1;
		int right = dfs(root.right) + 1;

		//进行平衡因子的判断
		if (Math.abs(left - right) > 1) {
			flag = false;
		}

		//该树的深度应该是左右子树中深度最大的那个
		return Math.max(left, right);
	}


}
