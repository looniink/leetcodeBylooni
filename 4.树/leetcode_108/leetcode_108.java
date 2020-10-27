package leetcode_108;

/**
 * @author :lujianbin
 * @create :2020-10-27 16:58:00
 * @description :根据升序数组，恢复一棵高度平衡的BST 二叉搜索树
 * @solution :BST的中序遍历是升序的，高度平衡：左右子树高度差<=1,所以选取中间节点，不止一种结果
 */
public class leetcode_108 {
	public TreeNode sortedArrayToBST(int[] nums) {
		return dfs(nums, 0, nums.length - 1);
	}

	public TreeNode dfs(int[] nums, int left, int right) {
		//判断异常，也是递归停止的条件
		if (left > right) {
			return null;
		}

		//选择中间位置左边的数字作为根节点
		int mid = (left + right) / 2;       //会丢掉小数点后的数字

		TreeNode root = new TreeNode(nums[mid]);
		//递归构建root的左右子树
		root.left = dfs(nums, left, mid - 1);
		root.right = dfs(nums, mid + 1, right);
		return root;
	}

}

