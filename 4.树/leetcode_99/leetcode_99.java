package leetcode_99;

import java.awt.*;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 * @author :lujianbin
 * @create :2020-11-11 18:07:00
 * @description :�ָ�����������(�������������������ڵ㱻���󽻻�)
 * @solution :���ö���������������ǵ����ģ��ҵ���������ڵ㣬Ȼ�󽻻��ڵ�
 */
public class leetcode_99 {
	public void recoverTree(TreeNode root) {
		ArrayList<TreeNode> list = new ArrayList<TreeNode>();
		TreeNode x = null;
		TreeNode y = null;
		dfs(root, list);
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i).val > list.get(i + 1).val) {
				y = list.get(i + 1);
				if (x == null) {
					x = list.get(i);
				}
			}
		}
		//��������ֵ
		if (x != null && y != null) {
			int tmp = x.val;
			x.val = y.val;
			y.val = tmp;
		}
	}

	//������������ѽ������list
	public void dfs(TreeNode root, ArrayList<TreeNode> list) {
		if (root == null) {
			return;
		}
		dfs(root.left, list);
		list.add(root);
		dfs(root.right, list);
	}
}
