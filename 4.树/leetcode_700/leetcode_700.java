package leetcode_700;

/**
 * @author :lujianbin
 * @create :2020-10-29 20:21:00
 * @description :�����������е�����
 */
public class leetcode_700 {
	public TreeNode searchBST(TreeNode root, int val) {
		if (root == null) {
			return null;
		}
		//����ֵС�ڵ�ǰ�ڵ�ֵ������������
		if (root.val > val) {
			return searchBST(root.left, val);
			//������ֵ���ڵ�ǰ�ڵ�ֵ������������
		} else if (root.val < val) {
			return searchBST(root.right, val);
		} else {
			return root;
		}
	}
}
