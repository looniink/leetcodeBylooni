package leetcode_108;

/**
 * @author :lujianbin
 * @create :2020-10-27 16:58:00
 * @description :�����������飬�ָ�һ�ø߶�ƽ���BST ����������
 * @solution :BST���������������ģ��߶�ƽ�⣺���������߶Ȳ�<=1,����ѡȡ�м�ڵ㣬��ֹһ�ֽ��
 */
public class leetcode_108 {
	public TreeNode sortedArrayToBST(int[] nums) {
		return dfs(nums, 0, nums.length - 1);
	}

	public TreeNode dfs(int[] nums, int left, int right) {
		//�ж��쳣��Ҳ�ǵݹ�ֹͣ������
		if (left > right) {
			return null;
		}

		//ѡ���м�λ����ߵ�������Ϊ���ڵ�
		int mid = (left + right) / 2;       //�ᶪ��С����������

		TreeNode root = new TreeNode(nums[mid]);
		//�ݹ鹹��root����������
		root.left = dfs(nums, left, mid - 1);
		root.right = dfs(nums, mid + 1, right);
		return root;
	}

}

