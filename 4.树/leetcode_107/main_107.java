package leetcode_107;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author :lujianbin
 * @create :2020-08-25 22:05:00
 * @description :二叉树的层序遍历(从下到上)
 */
public class main_107 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		if (root == null) return new ArrayList<>();
		ArrayList<List<Integer>> res = new ArrayList<>();
		LinkedList<TreeNode> queue = new LinkedList<>();

		queue.add(root);

		while (queue.size() > 0) {
			int size = queue.size();
			ArrayList<Integer> tmp = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				TreeNode t = queue.remove();
				tmp.add(t.val);
				if (t.left != null) {
					queue.add(t.left);
				}
				if (t.right != null) {
					queue.add(t.right);
				}
			}
			res.add(0, tmp);
		}
		return res;
	}
}
