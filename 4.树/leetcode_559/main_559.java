package leetcode_559;

import org.w3c.dom.Node;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author :lujianbin
 * @create :2020-08-24 10:14:00
 * @description :N叉树的深度
 */
public class main_559 {
	class Node {
		public int val;
		public List<Node> children;

		public Node() {
		}

		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, List<Node> _children) {
			val = _val;
			children = _children;
		}
	}

	//递归：重复调用自身，相当于是树结构
	//迭代：每次迭代的结果会作为下一次迭代的初值，相当于是一个环结构
	//深度优先搜索策略：一颗树的最大深度就是子树深度的最大值+1
	public int maxDepth(Node root) {
		if (root == null) return 0;
		//求出每个子树的最大深度
		int max = 0;
		for (var Node : root.children) {
			int temp = maxDepth(Node);
			max = Math.max(max, temp);
		}
		return max + 1;
	}
}
