package leetcode_590;

import java.util.*;

/**
 * @author :lujianbin
 * @create :2020-08-20 13:19:00
 * @description :迭代法树的后序遍历
 * 基本思路就是先将根压入栈，然后pop出栈，并对其子节点进行遍历并压入栈，循环直到栈为空，最后将list反转
 */
public class main_590_2 {
	//节点定义
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

	List<Integer> list;
	Deque<Node> stack;

	//迭代法
	public List<Integer> postorder(Node root) {
		list = new ArrayList<>();
		stack = new LinkedList<>();
		order(root);
		return list;
	}

	public void order(Node root) {
		if (root == null) return;

		stack.push(root);
		Node current;

		while (!stack.isEmpty()) {
			current = stack.pop();
			list.add(current.val);      //先放入根
			for (Node child : current.children) {
				stack.push(child);      //再放入孩子
			}
		}
		//如果将根先放入再左在右，则得到的顺序为从根->右->左
		//反转过后得到左->右->根
		Collections.reverse(list);
	}
}

