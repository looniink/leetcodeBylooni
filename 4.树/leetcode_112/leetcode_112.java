package leetcode_112;

import org.w3c.dom.Node;

import java.util.ArrayList;

/**
 * @author :lujianbin
 * @create :2021-01-23 11:51:00
 * @description :路径总和
 * @solution :特殊判断，单层解决方法，dfs深度优先搜索递归解决
 */
public class leetcode_112 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		System.out.print("数组： ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		//将数组放入二叉树
		TreeNode root = arrayToTree(arr, 0, arr.length - 1);
		System.out.println("数组转换为二叉树，中序遍历为：");
		printTreeByMidOrder(root);
		System.out.println();
		System.out.println("是否存在路径总和相等：" + hasPathSum(root, 5));
	}


	public static boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null) {
			return false;
		}
		//只有一个节点的时候直接判断当前节点是否==targetSum
		//相当于是递归结束的条件
		if (root.left == null && root.right == null) {
			//两个数比较直接返回true/false
			return root.val == targetSum;
		}
		//一直减去当前节点的值
		return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
	}

	public static TreeNode arrayToTree(int[] arr, int start, int end) {
		TreeNode root = null;
		if (end >= start) {
			root = new TreeNode();
			int mid = (start + end + 1) / 2;
			//二叉树根节点为数组中间的元素
			root.val = arr[mid];
			//递归方法用左半部分数组构造root的左子树
			root.left = arrayToTree(arr, start, mid - 1);
			//递归方法用右半部分数组构造root的右子树
			root.right = arrayToTree(arr, mid + 1, end);
		} else {
			root = null;
		}
		return root;
	}


	/**
	 * 用中序遍历的方式打印出二叉树节点的内容
	 */
	public static void printTreeByMidOrder(TreeNode root) {
		if (root == null) {
			return;
		}

		//遍历左子树
		if (root.left != null) {
			printTreeByMidOrder(root.left);
		}
		//遍历root结点
		System.out.print(root.val + " ");       //中序遍历也就是在中间打印内容

		//遍历右子树
		if (root.right != null) {
			printTreeByMidOrder(root.right);
		}
	}

}
