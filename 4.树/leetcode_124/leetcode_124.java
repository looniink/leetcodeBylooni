package leetcode_124;

/**
 * @author :lujianbin
 * @create :2020-11-02 19:45:00
 * @description :����һ���ǿն����������������·���͡�
 * @solution :
 */
public class leetcode_124 {
	//����ȫ�ֱ���
	int res = Integer.MIN_VALUE;

	public int maxPathSum(TreeNode root) {
		if (root == null) {
			return 0;
		}
		//���õݹ麯��
		dfs(root);
		return res;
	}

	//ʹ�ú�������������·����
	public int dfs(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int left = Math.max(0, dfs(root.left));          //��ڵ�Ĺ��׶�
		int right = Math.max(0, dfs(root.right));        //�ҽڵ�Ĺ��׶�
		res = Math.max(res, left + right + root.val);    //����ȫ�����·��ֵ
		return root.val + Math.max(left, right);         //���ص�ǰ�ڵ�Ĺ���ֵ
	}
}
