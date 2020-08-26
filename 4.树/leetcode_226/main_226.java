package leetcode_226;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :lujianbin
 * @create :2020-08-26 19:00:00
 * @description :二叉树的翻转
 * @solution : 递归交换每一层节点，递归的结束条件是节点为空的时候
 */
public class main_226 {
	public TreeNode invertTree(TreeNode root) {
		//递归终止条件：节点为空时返回
		if (root == null) return null;

		//三句语句将当前节点的左右子树交换
		TreeNode tmp = root.right;
		root.right = root.left;
		root.left = tmp;

		//递归交换当前左子树
		invertTree(root.left);
		//递归交换当前右子树
		invertTree(root.right);

		//在交换完之后直接返回root即可
		return root;
	}
}
