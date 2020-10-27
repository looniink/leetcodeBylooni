package leetcode_109;

import java.util.List;

/**
 * @author :lujianbin
 * @create :2020-10-27 20:34:00
 * @description :有序链表转化为二叉搜索树
 * @solution :做题方法与108，有序数组类似，只是链表无法直接找到中间节点  0876:寻找链表的中间节点
 */
public class leetcode_109 {
	public TreeNode sortedListToBST(ListNode head) {
		if (head == null) {
			return null;
		}

		//如果只有一个几点则直接返回该节点
		if (head.next == null) {
			return new TreeNode(head.val);
		}

		//快慢指针寻找中心节点
		ListNode fast = head;
		ListNode slow = head;
		ListNode mid = null;
		while (fast != null && fast.next != null) {
			mid = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		//链表断开，一部分为左子节点，一部分为右子节点
		mid.next = null;

		//以升序链表的中间元素作为根节点 root，递归的构建 root 的左子树与右子树
		TreeNode root = new TreeNode(slow.val);
		root.left = sortedListToBST(head);
		root.right = sortedListToBST(slow.next);

		return root;
	}
}
