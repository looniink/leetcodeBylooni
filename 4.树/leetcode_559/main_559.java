package leetcode_559;

import org.w3c.dom.Node;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author :lujianbin
 * @create :2020-08-24 10:14:00
 * @description :N���������
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

	//�ݹ飺�ظ����������൱�������ṹ
	//������ÿ�ε����Ľ������Ϊ��һ�ε����ĳ�ֵ���൱����һ�����ṹ
	//��������������ԣ�һ�����������Ⱦ���������ȵ����ֵ+1
	public int maxDepth(Node root) {
		if (root == null) return 0;
		//���ÿ��������������
		int max = 0;
		for (var Node : root.children) {
			int temp = maxDepth(Node);
			max = Math.max(max, temp);
		}
		return max + 1;
	}
}
