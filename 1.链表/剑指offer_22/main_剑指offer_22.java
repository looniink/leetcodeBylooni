package ��ָoffer_22;

/**
 * @author :lujianbin
 * @create :2020-07-17 20:16:00
 * @description :����һ����������������е�����k���ڵ㡣Ϊ�˷��ϴ�����˵�ϰ�ߣ������1��ʼ�������������β�ڵ��ǵ�����1���ڵ㡣���磬һ��������6���ڵ㣬��ͷ�ڵ㿪ʼ�����ǵ�ֵ������1��2��3��4��5��6���������ĵ�����3���ڵ���ֵΪ4�Ľڵ㡣
 */
public class main_��ָoffer_22 {
	//���������е�k���ڵ�
	public ListNode getKthFromEnd(ListNode head, int k) {
		//�ж������Ƿ�Ϊ���Լ�k�Ƿ�ΪС��0����
		if (head == null || k < 0) {
			return null;
		}
		//������ָ���ʼλ�ö�ָ��ͷ���
		ListNode right = head;
		ListNode left = head;

		//��right�ڵ�������kλ
		for (int i = 0; i < k - 1; i++) {
			if (right.next != null) {
				right = right.next;
			} else {
				return null;    //������̣�����k���ڵ�
			}
		}
		//����ָ���ƶ�k��λ�ú���ͬʱ�ƶ�����ָ�룬����ָ��Ϊ��ʱ��ָ��պ��ڵڵ���kλ����
		while (right.next != null) {
			left = left.next;
			right = right.next;
		}
		return left;
	}
}
