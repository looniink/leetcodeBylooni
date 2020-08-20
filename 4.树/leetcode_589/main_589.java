package leetcode_589;


import java.util.ArrayList;
import java.util.List;


/**
 * @author :lujianbin
 * @create :2020-08-19 12:20:00
 * @description :树的前序遍历，先遍历根节点再遍历左右的孩子节点
 */
@SuppressWarnings("all")
public class main_589 {
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


	public List<Integer> preorder(Node root) {
		List<Integer> res = new ArrayList<>();
		dfs(root, res);
		return res;
	}

	private void dfs(Node root, List<Integer> res) {
		if (root == null)
			return;
		res.add(root.val);      //先遍历根节点
		for (var child : root.children) {       //此处应为Node child,java 10过后可以用var变量来动态表示任意类型
			//var类型会根据所赋的值自动判断
			dfs(child, res);
		}
	}


}
