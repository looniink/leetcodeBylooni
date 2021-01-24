package ��ָoffer_68;

/**
 * @author :lujianbin
 * @create :2021-01-24 15:13:00
 * @description :�����������
 * @solution :
 */

public class main_��ָoffer_68 {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		/*
		��ֹ����
		 */

		//�ݹ���ֹ���� 1
		if (root == null) {
			return null;
		}
		//��ֹ���� 2       p����q���е���root�Ĳ࣬rootΪ�����������
		if (root == p || root == q) {
			return root;
		}

		/*
		�ݹ鹤��
		 */

		//�ݹ������������ֻҪ�����������ҵ���p��q�����ҵ�˭���ȷ���˭
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		// �ݹ������������ֻҪ�����������ҵ���p��q�������ҵ�˭�ͷ���˭
		TreeNode right = lowestCommonAncestor(root.right, p, q);

		/*
		����ֵ
		 */

		//���leftΪ�գ���p��q������root���������У�ֱ�ӷ���right
		if (left == null) {
			return right;   //���������ȱ��������Ǹ���������������ȣ�һ���ڵ�Ҳ���������Լ������ȣ�
		} else if (right == null) {
			//���rightΪ�գ���p��q������root���������У�ֱ�ӷ���left��
			return left;    //���������ȱ��������Ǹ���������������ȣ�һ���ڵ�Ҳ���������Լ������ȣ�
		} else {
			//���򣬵� left�� right����Ϊ��ʱ��˵�� p��q�ڵ�ֱ��� root���, ����������ȼ�Ϊ root
			return root;
		}
	}
}
