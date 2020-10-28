package leetcode_100;

/**
 * @author :lujianbin
 * @create :2020-10-28 19:27:00
 * @description :�ж��������Ƿ�����ͬ����
 * @solution :������������ǿյ�����ͬ��һ��λ��һ����Ϊ������ͬ�����ж�����λ���ϵ�ֵ�Ƿ���ͬ
 */
public class leetcode_100 {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}

		//����������һ��Ϊnull��һ����Ϊ��
		if (p == null || q == null) {
			return false;
		}

		if (p.val != q.val) {
			return false;
		}

		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}
}
