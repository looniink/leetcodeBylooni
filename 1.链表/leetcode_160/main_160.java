package leetcode_160;

/**
 * @author :lujianbin
 * @create :2020-07-22 09:22:00
 * @description :�ҵ������������ཻ����ʼ�ڵ㡣
 * @solution :A��B���������ȿ��ܲ�ͬ������A+B��B+A�ĳ�������ͬ�ģ����Ա���A+B�ͱ���B+Aһ����ͬʱ������
 * ���A,B�ཻ�Ļ�A��B��һ��β������ͬ�ģ���������������ָ��һ����ͬʱ���ｻ�� ���A,B���ཻ�Ļ�����ָ��ͻ�ͬʱ����A+B��B+A����β�ڵ�
 */
public class main_160 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		if (headA == null || headB == null) {
			return null;
		}
		ListNode nodeA = headA;     //nodeAָ��A�����ͷ��
		ListNode nodeB = headB;     //nodeBָ��B�����ͷ��
		while (nodeA != nodeB) {    //���û��ָ��ͬһ�ڵ㣬�����ѭ��
			nodeA = nodeA == null ? headB : nodeA.next;
			nodeB = nodeB == null ? headA : nodeB.next;
		}
		return nodeA;
	}
}
