package leetcode_1290;

/**
 * @author :lujianbin
 * @create :2020-08-01 23:30:00
 * @description :进制链表转整数
 */
public class main_1290 {
	//通过位运算
	//左移位运算   x<<n=x 2^n   5<<4 = 5*2^4=80    (x乘2的n次方)
	//右移位运算   x>>n= x/2^n  80>>4 = 80/2^4=5   (x除2的n次方)_
	public int getDecimalValue(ListNode head) {
		int number = 0;
		while (head != null) {
			number = number << 1 ^ head.val;
			head = head.next;
		}

		return number;
	}
}
