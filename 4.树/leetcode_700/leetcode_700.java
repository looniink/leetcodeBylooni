package leetcode_700;

/**
 * @author :lujianbin
 * @create :2020-10-29 20:21:00
 * @description :二叉搜索树中的搜索
 */
public class leetcode_700 {
	public TreeNode searchBST(TreeNode root, int val) {
		if (root == null) {
			return null;
		}
		//搜索值小于当前节点值，则向左搜索
		if (root.val > val) {
			return searchBST(root.left, val);
			//搜索的值大于当前节点值，则向右搜索
		} else if (root.val < val) {
			return searchBST(root.right, val);
		} else {
			return root;
		}
	}
}
