package 剑指offer_54;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :lujianbin
 * @create :2020-08-22 08:53:00
 * @description :二叉搜索树的第k大节点
 */
public class main_剑指offer_54 {
	//二叉搜索树的中序遍历为递增序列，其倒序则可以得到第k大的节点
	public int kthLargest(TreeNode root, int k) {
		//中序遍历时将递增结果的二叉搜索树放入表中
		ArrayList<Integer> list = new ArrayList<>();
		lnr(root, list);
		//小标按照数组下标一样从0开始
		return list.get(list.size() - k);       //例：倒数第一个数据就是第一个大的节点
	}

	//二叉搜索树的中序遍历
	public void lnr(TreeNode root, List list) {
		if (root == null) return;
		lnr(root.left, list);
		list.add(root.val); //遍历时将递增结果加入list
		lnr(root.right, list);
	}
}
