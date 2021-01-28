package ���Խ��_1712;

import java.util.ArrayList;

/**
 * @author :lujianbin
 * @create :2021-01-28 15:40:00
 * @description :���ݶ�����������ת���ɵ�����
 * @solution :
 */
public class main_���Խ��1712 {


	public TreeNode convertBiNode(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		dfs(root, list);
		return listToTreeNode(list);
	}

	public void dfs(TreeNode root, ArrayList<Integer> arrayList) {
		//��ֹ����
		if (root == null) {
			return;
		}
		//�ݹ�
		dfs(root.left, arrayList);
		arrayList.add(root.val);
		dfs(root.right, arrayList);
	}

	public TreeNode listToTreeNode(ArrayList<Integer> list) {
		if (list.size() == 0) {
			return null;
		}

		//���㷵��ͷ���
		TreeNode root = new TreeNode(list.get(0));
		TreeNode cur = root;

		for (int i = 1; i < list.size(); i++) {
			//����ڵ��ֵ��ֵΪnull
			cur.left = null;
			//���ù��췽���������ұ߽ڵ�
			cur.right = new TreeNode(list.get(i));
			//���ҽڵ���Ϊ��ǰ�ڵ�
			cur = cur.right;
		}
		return root;
	}


	//���нⷨ
	public TreeNode convertBiNode2(TreeNode root) {
		//�������ͷָ���ڱ�
		TreeNode head = new TreeNode(0);
		inorder(root, head);
		//���ڱ��ڵ���ұߵ���ͷ���
		return head.right;
	}

	public TreeNode inorder(TreeNode root, TreeNode prev) {
		if (root != null) {
			prev = inorder(root.left, prev);
			root.left = null;
			prev.right = root;
			prev = root;
			prev = inorder(root.right, prev);
		}
		return prev;
	}

}
