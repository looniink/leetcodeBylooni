package leetcode_99;

import java.awt.*;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 * @author :lujianbin
 * @create :2020-11-11 18:07:00
 * @description :恢复二叉搜索树(二叉搜索树中有两个节点被错误交换)
 * @solution :利用二叉树的中序遍历是递增的，找到两个错误节点，然后交换节点
 */
public class leetcode_99 {
	public void recoverTree(TreeNode root) {
		ArrayList<TreeNode> list = new ArrayList<TreeNode>();
		TreeNode x = null;
		TreeNode y = null;
		dfs(root, list);
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i).val > list.get(i + 1).val) {
				y = list.get(i + 1);
				if (x == null) {
					x = list.get(i);
				}
			}
		}
		//交换两个值
		if (x != null && y != null) {
			int tmp = x.val;
			x.val = y.val;
			y.val = tmp;
		}
	}

	//中序遍历，并把结果放入list
	public void dfs(TreeNode root, ArrayList<TreeNode> list) {
		if (root == null) {
			return;
		}
		dfs(root.left, list);
		list.add(root);
		dfs(root.right, list);
	}
}
