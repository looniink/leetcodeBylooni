package leetcode_226;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :lujianbin
 * @create :2020-08-26 19:00:00
 * @description :�������ķ�ת
 * @solution : �ݹ齻��ÿһ��ڵ㣬�ݹ�Ľ��������ǽڵ�Ϊ�յ�ʱ��
 */
public class main_226 {
	public TreeNode invertTree(TreeNode root) {
		//�ݹ���ֹ�������ڵ�Ϊ��ʱ����
		if (root == null) return null;

		//������佫��ǰ�ڵ��������������
		TreeNode tmp = root.right;
		root.right = root.left;
		root.left = tmp;

		//�ݹ齻����ǰ������
		invertTree(root.left);
		//�ݹ齻����ǰ������
		invertTree(root.right);

		//�ڽ�����֮��ֱ�ӷ���root����
		return root;
	}
}
