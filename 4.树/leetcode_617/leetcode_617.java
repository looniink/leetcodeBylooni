package leetcode_617;

/**
 * @author :lujianbin
 * @create :2021-01-29 11:20:00
 * @description :�ϲ�������
 * @solution :��ֹ�������ݹ��������ݹ鷵��ֵ
 */
public class leetcode_617 {
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) {
			return null;
		}
		return dfs(t1, t2);
	}


	public TreeNode dfs(TreeNode t1, TreeNode t2) {
		//��ֹ����,t2����t1��ֻҪ��һ��Ϊ�վ�ֱ�ӷ���
		if (t1 == null || t2 == null) {
			return t1 == null ? t2 : t1;
		}

		//�ݹ��ڼ���еĲ����������������Ϊ�գ���ֵ�ӵ�t1��
		t1.val += t2.val;

		//��ڵ�ݹ�
		t1.left = dfs(t1.left, t2.left);

		//�ҽڵ�ݹ�
		t1.right = dfs(t1.right, t2.right);
		return t1;
	}
}
