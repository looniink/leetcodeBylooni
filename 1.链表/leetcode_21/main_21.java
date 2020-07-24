package leetcode_21;

/**
 * @author :lujianbin
 * @create :2020-07-24 14:56:00
 * @description :�ϲ�������������
 */
public class main_21 {
	//�ݹ�ⷨ:�������ж� l1 �� l2 ͷ����ĸ���С��Ȼ���С���� next ָ��ָ��������ĺϲ�����������õݹ飩
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		//���Ƚ�ʱ����һ��Ϊ��ʱ��ֱ�Ӻϲ�
		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		} else if (l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);       //���l1��С�����l1������l1����һ���ڵ���l2���бȽ�
			return l1;
		} else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;                                  //�����l2��С�����l2,����l2����һ���ڵ���l1���бȽ�
		}
	}
}
