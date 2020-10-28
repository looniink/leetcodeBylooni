package leetcode_100;

/**
 * @author :lujianbin
 * @create :2020-10-28 19:27:00
 * @description :判断两个树是否是相同的树
 * @solution :如果两个树都是空的则相同，一个位空一个不为空则不相同，再判断两个位置上的值是否相同
 */
public class leetcode_100 {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}

		//两个当中有一个为null另一个不为空
		if (p == null || q == null) {
			return false;
		}

		if (p.val != q.val) {
			return false;
		}

		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}
}
