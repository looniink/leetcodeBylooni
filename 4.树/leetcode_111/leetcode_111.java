package leetcode_111;

/**
 * @author :lujianbin
 * @create :2021-01-22 12:24:00
 * @description :����������С���
 * @solution :����dfs�ݹ�ķ���
 */
public class leetcode_111 {

	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		//�ݹ�Ľ�������
		if (root.left == null && root.right == null) {
			return 1;
		}

		//���������ݹ�
		int left = minDepth(root.left);
		int right = minDepth(root.right);

		//������Ϊ�ջ���������Ϊ��ʱ
		if (root.left == null || root.right == null) {
			return left + right + 1;
		}

		//��������������Ϊ�յ�ʱ��
		return Math.min(left, right) + 1;
	}
}
