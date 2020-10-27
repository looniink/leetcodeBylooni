package leetcode_109;

import java.util.List;

/**
 * @author :lujianbin
 * @create :2020-10-27 20:34:00
 * @description :��������ת��Ϊ����������
 * @solution :���ⷽ����108�������������ƣ�ֻ�������޷�ֱ���ҵ��м�ڵ�  0876:Ѱ��������м�ڵ�
 */
public class leetcode_109 {
	public TreeNode sortedListToBST(ListNode head) {
		if (head == null) {
			return null;
		}

		//���ֻ��һ��������ֱ�ӷ��ظýڵ�
		if (head.next == null) {
			return new TreeNode(head.val);
		}

		//����ָ��Ѱ�����Ľڵ�
		ListNode fast = head;
		ListNode slow = head;
		ListNode mid = null;
		while (fast != null && fast.next != null) {
			mid = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		//����Ͽ���һ����Ϊ���ӽڵ㣬һ����Ϊ���ӽڵ�
		mid.next = null;

		//������������м�Ԫ����Ϊ���ڵ� root���ݹ�Ĺ��� root ����������������
		TreeNode root = new TreeNode(slow.val);
		root.left = sortedListToBST(head);
		root.right = sortedListToBST(slow.next);

		return root;
	}
}
