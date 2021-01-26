package leetcode_257;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :lujianbin
 * @create :2021-01-26 12:55:00
 * @description :������������·��
 * @solution :�����������
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

		//�����Ҷ�ӽڵ㣬˵���ҵ���һ��ͼ�⣬�������뵽res��
		//�����ǰ�ڵ������Ҷ�ӽڵ㣬��ôƴ�ӵ�������root.val

		if (root.left == null && root.right == null) {
			res.add(path + root.val);
			return;
		}

		//�����ǰ�ڵ㲻��Ҷ�ӽڵ㣬��ôƴ�ӵ�������root.val+"->"
		//�������Ҷ�ӽڵ㣬��ֱ�������������ӽڵ�
		dfs(root.left, path + root.val + "->", res);
		dfs(root.right, path + root.val + "->", res);
	}
}
