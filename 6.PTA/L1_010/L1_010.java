package L1_010;

import javax.naming.ldap.HasControls;
import java.util.*;

/**
 * @author :lujianbin
 * @create :2020-11-12 15:39:00
 * @description :�Ƚϴ�С
 * @solution :
 */
public class L1_010 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String[] split = s.split(" ");
		int[] numbers = new int[3];
		for (int i = 0; i < split.length; i++) {
			numbers[i] = Integer.parseInt(split[i]);
		}
		Arrays.sort(numbers);
		//�ɽ��е����ӡ���ɵ���
		/*for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i]);
		}*/
		System.out.println(numbers[0] + "->" + numbers[1] + "->" + numbers[2]);
	}
}

