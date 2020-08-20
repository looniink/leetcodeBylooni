package leetcode_589;


import java.util.ArrayList;
import java.util.List;


/**
 * @author :lujianbin
 * @create :2020-08-19 12:20:00
 * @description :����ǰ��������ȱ������ڵ��ٱ������ҵĺ��ӽڵ�
 */
@SuppressWarnings("all")
public class main_589 {
	//�ڵ�ṹ
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
		res.add(root.val);      //�ȱ������ڵ�
		for (var child : root.children) {       //�˴�ӦΪNode child,java 10���������var��������̬��ʾ��������
			//var���ͻ����������ֵ�Զ��ж�
			dfs(child, res);
		}
	}


}
