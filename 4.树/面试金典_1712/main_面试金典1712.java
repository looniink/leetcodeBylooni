package 面试金典_1712;

import java.util.ArrayList;

/**
 * @author :lujianbin
 * @create :2021-01-28 15:40:00
 * @description :根据二叉搜索树，转换成单链表
 * @solution :
 */
public class main_面试金典1712 {


	public TreeNode convertBiNode(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		dfs(root, list);
		return listToTreeNode(list);
	}

	public void dfs(TreeNode root, ArrayList<Integer> arrayList) {
		//终止条件
		if (root == null) {
			return;
		}
		//递归
		dfs(root.left, arrayList);
		arrayList.add(root.val);
		dfs(root.right, arrayList);
	}

	public TreeNode listToTreeNode(ArrayList<Integer> list) {
		if (list.size() == 0) {
			return null;
		}

		//方便返回头结点
		TreeNode root = new TreeNode(list.get(0));
		TreeNode cur = root;

		for (int i = 1; i < list.size(); i++) {
			//将左节点的值赋值为null
			cur.left = null;
			//利用构造方法，创建右边节点
			cur.right = new TreeNode(list.get(i));
			//将右节点作为当前节点
			cur = cur.right;
		}
		return root;
	}


	//大佬解法
	public TreeNode convertBiNode2(TreeNode root) {
		//单链表的头指针哨兵
		TreeNode head = new TreeNode(0);
		inorder(root, head);
		//在哨兵节点的右边的是头结点
		return head.right;
	}

	public TreeNode inorder(TreeNode root, TreeNode prev) {
		if (root != null) {
			prev = inorder(root.left, prev);
			root.left = null;
			prev.right = root;
			prev = root;
			prev = inorder(root.right, prev);
		}
		return prev;
	}

}
