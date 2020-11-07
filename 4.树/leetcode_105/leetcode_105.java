package leetcode_105;

/**
 * @author :lujianbin
 * @create :2020-11-06 22:04:00
 * @description :
 * @solution :
 */
public class leetcode_105 {
	int in = 0;
	int pre = 0;

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		return bulid(preorder, inorder, Integer.MIN_VALUE);
	}

	//前序遍历的基础上多增加了一个参数进行数组索引的控制
	public TreeNode bulid(int[] preorder, int[] inorder, int stop) {
		if (pre >= preorder.length) {
			return null;
		}

		if (inorder[in] == stop) {
			in++;
			return null;
		}

		TreeNode root = new TreeNode(preorder[pre++]);
		//必须先执行左节点的操作，因为前序遍历从左到右获取节点
		root.left = bulid(preorder, inorder, root.val);
		//接着再执行右节点的操作
		root.right = bulid(preorder, inorder, stop);
		return root;

	}
}
