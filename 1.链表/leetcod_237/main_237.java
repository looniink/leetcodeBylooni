package leetcod_237;

/**
 * @author :lujianbin
 * @create :2020-07-27 12:43:00
 * @description : ɾ�������еĽڵ�
 */
public class main_237 {
	//����ĳ���ڵ㣬ɾ������
	public void deleteNode(ListNode node) {
		node.val = node.next.val;     //���ýڵ�����ֵ��ֵ���ýڵ�
		node.next = node.next.next;   //����һ���ڵ��ֵ��ֵ����ǰ�ڵ�����ٽ�ָ��ָ�����¸��ڵ㣬�Ӷ�ɾ���ýڵ����һ���ڵ�
	}
}
