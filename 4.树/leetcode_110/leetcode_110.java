package leetcode_110;

import java.awt.dnd.DragSource;

/**
 * @author :lujianbin
 * @create :2020-10-31 20:54:00
 * @description :����һ�����������ж����Ƿ��Ǹ߶�ƽ��Ķ�����
 */
public class leetcode_110 {
	boolean flag = true;

	public boolean isBalanced(TreeNode root) {
		//dfs�ж��Ƿ�ƽ��
		dfs(root);
		return flag;
	}

	public int dfs(TreeNode root) {
		if (root == null) {
			return 0;
		}

		//����������������
		int left = dfs(root.left) + 1;
		int right = dfs(root.right) + 1;

		//����ƽ�����ӵ��ж�
		if (Math.abs(left - right) > 1) {
			flag = false;
		}

		//���������Ӧ����������������������Ǹ�
		return Math.max(left, right);
	}


}
