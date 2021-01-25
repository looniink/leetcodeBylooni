package leetcode_235;

/**
 * @author :lujianbin
 * @create :2021-01-25 15:52:00
 * @description :�����������������������
 * @solution :���ö��������������ʽ��еݹ�
 */
public class leetcode_235 {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		//��ֹ����1
		if (root == null) {
			return null;
		}
		if (p.val > root.val && q.val > root.val) {
			//����root��ֵ���������������еݹ�
			return lowestCommonAncestor(root.right, p, q);
		} else if (p.val < root.val && q.val < root.val) {
			return lowestCommonAncestor(root.left, p, q);
		}

		return root;    //���϶�������˵������������Ȳ������ҽڵ��ϣ�ֻ��Ϊ���
	}
}
