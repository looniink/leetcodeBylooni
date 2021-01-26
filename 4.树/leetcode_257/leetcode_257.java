package leetcode_257;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :lujianbin
 * @create :2021-01-26 12:55:00
 * @description :二叉树的所有路径
 * @solution :深度优先搜索
 */
public class leetcode_257 {

	public List<String> binaryTreePaths(TreeNode root) {
		ArrayList<String> res = new ArrayList<>();
		dfs(root, "", res);
		return res;
	}

	public void dfs(TreeNode root, String path, List<String> res) {

		if (root == null) {
			return;
		}

		//如果是叶子节点，说明找到了一条图解，把它加入到res中
		//如果当前节点如果是叶子节点，那么拼接的内容是root.val

		if (root.left == null && root.right == null) {
			res.add(path + root.val);
			return;
		}

		//如果当前节点不是叶子节点，那么拼接的内容是root.val+"->"
		//如果不是叶子节点，则分别遍历他的左右子节点
		dfs(root.left, path + root.val + "->", res);
		dfs(root.right, path + root.val + "->", res);
	}
}
