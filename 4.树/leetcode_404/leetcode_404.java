package leetcode_404;

/**
 * @author :lujianbin
 * @create :2021-01-27 20:01:00
 * @description :���������������������Ҷ��֮��
 * @solution :���������������Ҷ�ӽڵ�ֵ֮��
 */
public class leetcode_404 {


	public int sumOfLeftLeaves(TreeNode root) {
		int sum = 0;
		//�ݹ��������
		if (root == null) {
			return 0;
		}

		//�ݹ��ڼ���еĹ���
		//�����������Ҷ�ӽڵ�����ϵ�ǰ��ֵ
		if (root.left != null && root.left.left == null && root.left.right == null) {
			sum += root.left.val;
		}

		//��������,�������ݹ�
		return sum + sumOfLeftLeaves(root.right) + sumOfLeftLeaves(root.left);
	}
}
