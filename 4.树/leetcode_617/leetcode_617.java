package leetcode_617;

/**
 * @author :lujianbin
 * @create :2021-01-29 11:20:00
 * @description :合并二叉树
 * @solution :终止条件，递归间操作，递归返回值
 */
public class leetcode_617 {
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) {
			return null;
		}
		return dfs(t1, t2);
	}


	public TreeNode dfs(TreeNode t1, TreeNode t2) {
		//终止条件,t2或者t1中只要有一个为空就直接返回
		if (t1 == null || t2 == null) {
			return t1 == null ? t2 : t1;
		}

		//递归期间进行的操作，如果两个都不为空，则将值加到t1上
		t1.val += t2.val;

		//左节点递归
		t1.left = dfs(t1.left, t2.left);

		//右节点递归
		t1.right = dfs(t1.right, t2.right);
		return t1;
	}
}
