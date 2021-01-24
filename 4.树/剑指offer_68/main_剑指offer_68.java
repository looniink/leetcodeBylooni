package 剑指offer_68;

/**
 * @author :lujianbin
 * @create :2021-01-24 15:13:00
 * @description :最近公共祖先
 * @solution :
 */

public class main_剑指offer_68 {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		/*
		终止条件
		 */

		//递归终止条件 1
		if (root == null) {
			return null;
		}
		//终止条件 2       p或者q中有等于root的侧，root为最近公共祖先
		if (root == p || root == q) {
			return root;
		}

		/*
		递归工作
		 */

		//递归遍历左子树，只要在左子树中找到了p或q，先找到谁就先返回谁
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		// 递归遍历右子树，只要在右子树中找到了p或q，则先找到谁就返回谁
		TreeNode right = lowestCommonAncestor(root.right, p, q);

		/*
		返回值
		 */

		//如果left为空，则p，q都不在root的左子树中，直接返回right
		if (left == null) {
			return right;   //右子树中先遍历到的那个就是最近公共祖先（一个节点也可以是它自己的祖先）
		} else if (right == null) {
			//如果right为空，则p，q都不在root的右子树中，直接返回left，
			return left;    //左子树中先遍历到的那个就是最近公共祖先（一个节点也可以是它自己的祖先）
		} else {
			//否则，当 left和 right均不为空时，说明 p、q节点分别在 root异侧, 最近公共祖先即为 root
			return root;
		}
	}
}
