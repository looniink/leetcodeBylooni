package leetcode_590;

import java.util.*;

/**
 * @author :lujianbin
 * @create :2020-08-20 13:19:00
 * @description :���������ĺ������
 * ����˼·�����Ƚ���ѹ��ջ��Ȼ��pop��ջ���������ӽڵ���б�����ѹ��ջ��ѭ��ֱ��ջΪ�գ����list��ת
 */
public class main_590_2 {
	//�ڵ㶨��
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

	//������
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
			list.add(current.val);      //�ȷ����
			for (Node child : current.children) {
				stack.push(child);      //�ٷ��뺢��
			}
		}
		//��������ȷ����������ң���õ���˳��Ϊ�Ӹ�->��->��
		//��ת����õ���->��->��
		Collections.reverse(list);
	}
}

