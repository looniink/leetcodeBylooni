package leetcode_501;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :lujianbin
 * @create :2021-01-30 11:33:00
 * @description :�����������е�����
 * @solution :
 */
public class leetcode_501 {
	List<Integer> answer = new ArrayList<Integer>();
	//base:��¼��ǰ���֣�count:��¼��ǰ�����ظ��Ĵ�����maxCount:����
	int base, count, maxCount;

	public int[] findMode(TreeNode root) {
		dfs(root);
		int[] mode = new int[answer.size()];
		for (int i = 0; i < answer.size(); ++i) {
			mode[i] = answer.get(i);
		}
		return mode;
	}

	public void dfs(TreeNode o) {
		if (o == null) {
			return;
		}
		dfs(o.left);
		update(o.val);  //�����������ʱ������ԭ����ֱ�ӽ����ж�
		dfs(o.right);
	}

	//����������н��У�Ҳ�����ڵ��������н���
	//base:��¼��ǰ���֣�count:��¼��ǰ�����ظ��Ĵ�����maxCount:���������Ǹ����ֳ��ֵĴ���
	public void update(int x) {
		if (x == base) {    //�����һ�����ֺ͵�ǰ�����������count+1
			++count;
		} else {
			count = 1;      //����������count��λΪ1
			base = x;       //��base����Ϊ��ǰ����
		}
		if (count == maxCount) {    //˵�������ֳ��ֵĴ������ڵ�ǰ�������ֵĴ�������base����answer����
			answer.add(base);
		}
		if (count > maxCount) {    //˵����ǰ��������ֳ��ֵĴ������ڵ�ǰ�������ֵĴ���
			maxCount = count;      //����maxCountΪ��ǰ�������count
			answer.clear();        //���answer����
			answer.add(base);      //����ǰ��������뼯��
		}
	}
}

