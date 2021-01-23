package leetcode_112;

import org.w3c.dom.Node;

import java.util.ArrayList;

/**
 * @author :lujianbin
 * @create :2021-01-23 11:51:00
 * @description :·���ܺ�
 * @solution :�����жϣ�������������dfs������������ݹ���
 */
public class leetcode_112 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		System.out.print("���飺 ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		//��������������
		TreeNode root = arrayToTree(arr, 0, arr.length - 1);
		System.out.println("����ת��Ϊ���������������Ϊ��");
		printTreeByMidOrder(root);
		System.out.println();
		System.out.println("�Ƿ����·���ܺ���ȣ�" + hasPathSum(root, 5));
	}


	public static boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null) {
			return false;
		}
		//ֻ��һ���ڵ��ʱ��ֱ���жϵ�ǰ�ڵ��Ƿ�==targetSum
		//�൱���ǵݹ����������
		if (root.left == null && root.right == null) {
			//�������Ƚ�ֱ�ӷ���true/false
			return root.val == targetSum;
		}
		//һֱ��ȥ��ǰ�ڵ��ֵ
		return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
	}

	public static TreeNode arrayToTree(int[] arr, int start, int end) {
		TreeNode root = null;
		if (end >= start) {
			root = new TreeNode();
			int mid = (start + end + 1) / 2;
			//���������ڵ�Ϊ�����м��Ԫ��
			root.val = arr[mid];
			//�ݹ鷽������벿�����鹹��root��������
			root.left = arrayToTree(arr, start, mid - 1);
			//�ݹ鷽�����Ұ벿�����鹹��root��������
			root.right = arrayToTree(arr, mid + 1, end);
		} else {
			root = null;
		}
		return root;
	}


	/**
	 * ����������ķ�ʽ��ӡ���������ڵ������
	 */
	public static void printTreeByMidOrder(TreeNode root) {
		if (root == null) {
			return;
		}

		//����������
		if (root.left != null) {
			printTreeByMidOrder(root.left);
		}
		//����root���
		System.out.print(root.val + " ");       //�������Ҳ�������м��ӡ����

		//����������
		if (root.right != null) {
			printTreeByMidOrder(root.right);
		}
	}

}
