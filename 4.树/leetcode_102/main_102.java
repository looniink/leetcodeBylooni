package leetcode_102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author :lujianbin
 * @create :2020-08-23 09:22:00
 * @description :二叉树的层序遍历(从上到下)
 */
public class main_102 {
	public List<List<Integer>> levelOrder(TreeNode root) {
		if (root == null) {
			return new ArrayList<>();
		}

		List<List<Integer>> res = new ArrayList<>();        //list参数也可以是list
		LinkedList<TreeNode> queue = new LinkedList<>();

		//将根节点放入队列中，然后不断遍历队列
		queue.add(root);

		//将根节点放入队列中，不断遍历队列
		while (queue.size() > 0) {
			//获取当前队列长度，这个长度相当于这一层的节点个数
			int size = queue.size();
			//将队列中的元素都拿出来，也就是获取这一层的节点，放到临时的list中
			ArrayList<Integer> tmp = new ArrayList<>();
			//如果节点的左右子树不为空，也放入队列中
			for (int i = 0; i < size; i++) {
				TreeNode t = queue.remove();    //获取并删除头元素
				tmp.add(t.val);                 //将获取的值添加到tmp临时列表中
				if (t.left != null) {
					queue.add(t.left);
				}
				if (t.right != null) {
					queue.add(t.right);
				}
			}
			//将临时list加入最终返回的结果中
			res.add(tmp);
		}
		return res;
	}
}
