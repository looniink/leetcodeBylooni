package leetcode_590;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :lujianbin
 * @create :2020-08-20 11:18:00
 * @description : ���ĺ���������������������ڵ�
 */
public class main_590 {
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


	List<Integer> res = new ArrayList<>();

	//�ݹ�ⷨ
	public List<Integer> postorder(Node root) {
		if (root == null)
			return res; //������ڵ�Ϊ����ֱ�ӷ���res
		if (root.children != null) {        //������ӽڵ㲻Ϊ�գ����ȱ����ӽڵ�
			for (var child : root.children) {
				postorder(child);       //�ݹ齫�ӽڵ���Ϊ���ڵ㴫��postorder��������
			}
		}
		res.add(root.val);  //���ʸ��ڵ�
		return res;
	}

}
















