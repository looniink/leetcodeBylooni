package leetcode_1290;

/**
 * @author :lujianbin
 * @create :2020-08-01 23:30:00
 * @description :��������ת����
 */
public class main_1290 {
	//ͨ��λ����
	//����λ����   x<<n=x 2^n   5<<4 = 5*2^4=80    (x��2��n�η�)
	//����λ����   x>>n= x/2^n  80>>4 = 80/2^4=5   (x��2��n�η�)_
	public int getDecimalValue(ListNode head) {
		int number = 0;
		while (head != null) {
			number = number << 1 ^ head.val;
			head = head.next;
		}

		return number;
	}
}
