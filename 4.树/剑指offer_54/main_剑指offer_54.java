package ��ָoffer_54;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :lujianbin
 * @create :2020-08-22 08:53:00
 * @description :�����������ĵ�k��ڵ�
 */
public class main_��ָoffer_54 {
	//�������������������Ϊ�������У��䵹������Եõ���k��Ľڵ�
	public int kthLargest(TreeNode root, int k) {
		//�������ʱ����������Ķ����������������
		ArrayList<Integer> list = new ArrayList<>();
		lnr(root, list);
		//С�갴�������±�һ����0��ʼ
		return list.get(list.size() - k);       //����������һ�����ݾ��ǵ�һ����Ľڵ�
	}

	//�������������������
	public void lnr(TreeNode root, List list) {
		if (root == null) return;
		lnr(root.left, list);
		list.add(root.val); //����ʱ�������������list
		lnr(root.right, list);
	}
}
