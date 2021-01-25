package leetcode_235;

/**
 * @author :lujianbin
 * @create :2021-01-25 15:52:00
 * @description :二叉搜索树的最近公共祖先
 * @solution :利用二叉搜索树的性质进行递归
 */
public class leetcode_235 {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		//终止条件1
		if (root == null) {
			return null;
		}
		if (p.val > root.val && q.val > root.val) {
			//都比root的值大，则在右子树进行递归
			return lowestCommonAncestor(root.right, p, q);
		} else if (p.val < root.val && q.val < root.val) {
			return lowestCommonAncestor(root.left, p, q);
		}

		return root;    //已上都不满足说明最近公共祖先不在左右节点上，只能为最顶端
	}
}
