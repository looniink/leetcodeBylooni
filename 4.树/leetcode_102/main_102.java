package leetcode_102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author :lujianbin
 * @create :2020-08-23 09:22:00
 * @description :�������Ĳ������
 */
public class main_102 {
	public List<List<Integer>> levelOrder(TreeNode root) {
		if (root == null) {
			return new ArrayList<>();
		}

		List<List<Integer>> res = new ArrayList<>();        //list����Ҳ������list
		LinkedList<TreeNode> queue = new LinkedList<>();

		//�����ڵ��������У�Ȼ�󲻶ϱ�������
		queue.add(root);

		//�����ڵ��������У����ϱ�������
		while (queue.size() > 0) {
			//��ȡ��ǰ���г��ȣ���������൱����һ��Ľڵ����
			int size = queue.size();
			//�������е�Ԫ�ض��ó�����Ҳ���ǻ�ȡ��һ��Ľڵ㣬�ŵ���ʱ��list��
			ArrayList<Integer> tmp = new ArrayList<>();
			//����ڵ������������Ϊ�գ�Ҳ���������
			for (int i = 0; i < size; i++) {
				TreeNode t = queue.remove();    //��ȡ��ɾ��ͷԪ��
				tmp.add(t.val);                 //����ȡ��ֵ��ӵ�tmp��ʱ�б���
				if (t.left != null) {
					queue.add(t.left);
				}
				if (t.right != null) {
					queue.add(t.right);
				}
			}
			//����ʱlist�������շ��صĽ����
			res.add(tmp);
		}
		return res;
	}
}
