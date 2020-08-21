package ��ָoffer_55_I;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author :lujianbin
 * @create :2020-08-21 08:23:00
 * @description :�����������
 * @way : ���ĺ������(�����������������)
 */
public class main_��ָoffer_55_I {
	//�ؼ���:��������ȵ������������������������е����ֵ+1
	public int maxDepth2(TreeNode root) {
		if (root == null)
			return 0;
		//�ݹ�ⷨ
		return Math.max(maxDepth2(root.left), maxDepth2(root.right)) + 1;
	}


	//��������������:ÿ����һ�������+1,ֱ���������꣬���ɵõ����
	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;

		Queue<TreeNode> queue = new LinkedList<>();
		//���ڵ����
		queue.add(root);
		int res = 0;

		while (!queue.isEmpty()) {
			//ÿ��Ľڵ���
			int n = queue.size();
			for (int i = 0; i < n; i++) {
				//ͷ�����ӣ����г���-1
				TreeNode node = queue.poll();   //�Ӷ�����ɾ����һ��Ԫ��
				//ÿ���������һ��Ľڵ�������
				if (node.left != null) queue.add(node.left);
				if (node.right != null) queue.add(node.right);
			}
			//ÿ������һ�㣬���+1
			res++;
		}
		return res;
	}
}
