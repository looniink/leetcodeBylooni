package leetcode_124;

/**
 * @author :lujianbin
 * @create :2020-11-02 19:45:00
 * @description :给定一个非空二叉树，返回其最大路径和。
 * @solution :
 */
public class leetcode_124 {
	//定义全局变量
	int res = Integer.MIN_VALUE;

	public int maxPathSum(TreeNode root) {
		if (root == null) {
			return 0;
		}
		//调用递归函数
		dfs(root);
		return res;
	}

	//使用后序遍历计算最大路径和
	public int dfs(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int left = Math.max(0, dfs(root.left));          //左节点的贡献度
		int right = Math.max(0, dfs(root.right));        //右节点的贡献度
		res = Math.max(res, left + right + root.val);    //更新全局最大路径值
		return root.val + Math.max(left, right);         //返回当前节点的贡献值
	}
}
