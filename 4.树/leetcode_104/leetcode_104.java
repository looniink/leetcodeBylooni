package leetcode_104;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author :lujianbin
 * @create :2020-08-21 08:23:00
 * @description :二叉树的深度
 * @way : 树的后序遍历(类似于深度优先搜索)
 */
public class leetcode_104 {
	//关键点:该树的深度等于左子树深度与右子树深度中的最大值+1
	public int maxDepth2(TreeNode root) {
		if (root == null)
			return 0;
		//递归解法
		return Math.max(maxDepth2(root.left), maxDepth2(root.right)) + 1;
	}


	//层序遍历解决方法:每遍历一层计数器+1,直到最后遍历完，即可得到深度
	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;

		Queue<TreeNode> queue = new LinkedList<>();
		//根节点入队
		queue.add(root);
		int res = 0;

		while (!queue.isEmpty()) {
			//每层的节点数
			int n = queue.size();
			for (int i = 0; i < n; i++) {
				//头结点出队，队列长度-1
				TreeNode node = queue.poll();   //从队列中删除第一个元素
				//每层遍历将下一层的节点加入队列
				if (node.left != null) queue.add(node.left);
				if (node.right != null) queue.add(node.right);
			}
			//每遍历完一层，深度+1
			res++;
		}
		return res;
	}
}
