package ����_0201;

import java.util.HashSet;

/**
 * @author :lujianbin
 * @create :2020-07-30 20:58:00
 * @description :
 */
public class main_����_0201 {
	/*//˫ָ�뷽��:����ָ�룬ȡֵһһ�Ƚϣ������ͬ��������ֵ(������������)
	public ListNode removeDuplicateNodes(ListNode head) {
		ListNode cur = head;        //curָ��ͷ���
		while (cur != null) {
			ListNode temp = cur;    //tempָ��curָ��
			while (temp.next != null) {
				if (temp.next.val == cur.val) {
					temp.next = temp.next.next;     //������ֺ�����ֵ��ͬ�Ľڵ�������
				} else {
					temp = temp.next;     //���αȽ���������нڵ�
				}
			}
			cur = cur.next;   //��ֵ�Ƚ����Ƚ���һ��ֵ
		}
		return head;
	}*/

	//ʹ��set���Ͻ���ȥ��
	public ListNode removeDuplicateNodes(ListNode head) {
		HashSet<Integer> set = new HashSet<>();
		ListNode cur = head;
		while (cur != null && cur.next != null) {
			set.add(cur.val);   //��Ԫ��ȫ������set����
			if (set.contains(cur.next.val)) {       //����ÿ��Ԫ����Ƚ϶���Ƚϣ������ͬ�򷵻�true
				cur.next = cur.next.next;           //set���ϵ�containsҪ�ж�hashcode������equals����
			} else {                                //list���ϵ�contains����ֻ�ж�equals����
				cur = cur.next;
			}
		}
		return head;
	}
}














