package leetcode_101;

/**
 * @author :lujianbin
 * @create :2020-10-30 21:31:00
 * @description :����һ����������������Ƿ��Ǿ���ԳƵġ�
 * @solution :��鵥���������������Ƿ�Գ��ٵݹ�
 */
public class leetcode_101 {
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}

		return dfs(root.left, root.right);
	}

	public boolean dfs(TreeNode left, TreeNode right) {
		//�������������Ϊ�տ϶��Գ�
		if (left == null && right == null) {
			return true;
		}
		//�����ڵ��г���һ���ڵ�Ϊ����϶����Գ�
		if (left == null || right == null) {
			return false;
		}

		//���������ڵ��ֵ�����
		if (left.val != right.val) {
			return false;
		}

		//����ݹ�Ƚ� �������������������������������Ƿ���� &&�������������������������������Ƿ����
		return dfs(left.left, right.right) && dfs(left.right, right.left);

	}
}
