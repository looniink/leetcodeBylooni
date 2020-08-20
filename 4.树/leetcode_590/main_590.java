package leetcode_590;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :lujianbin
 * @create :2020-08-20 11:18:00
 * @description : 树的后序遍历，先左再右最后根节点
 */
public class main_590 {
	//节点结构
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


	List<Integer> res = new ArrayList<>();

	//递归解法
	public List<Integer> postorder(Node root) {
		if (root == null)
			return res; //如果根节点为空则直接返回res
		if (root.children != null) {        //如果孩子节点不为空，则先遍历子节点
			for (var child : root.children) {
				postorder(child);       //递归将子节点作为根节点传入postorder函数遍历
			}
		}
		res.add(root.val);  //访问根节点
		return res;
	}

}
















