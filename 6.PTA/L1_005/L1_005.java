package L1_005;


import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * @author :lujianbin
 * @create :2020-11-07 16:32:00
 * @description :考试座位号
 * @solution :超时难受
 */
public class L1_005 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//输入考生数量
		int sum = scanner.nextInt();

		//试机座位号，准考证号map
		LinkedHashMap<Integer, String> integerStringLinkedHashMap = new LinkedHashMap<>();

		//试机座位号，考试座位号
		LinkedHashMap<Integer, Integer> integerIntegerLinkedHashMap = new LinkedHashMap<>();
		for (int i = 0; i < sum; i++) {
			//输入准考证号
			String s = scanner.next();
			//输入试机座位号
			int testNumber = scanner.nextInt();
			//输入考试座位号
			int examNumber = scanner.nextInt();
			integerStringLinkedHashMap.put(testNumber, s);
			integerIntegerLinkedHashMap.put(testNumber, examNumber);
		}

		//输入需要查询考试座位号的学生的个数
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			//输入试机座位号，分别对应两个map,查询到准考证号与考试座位号
			int testSeat = scanner.nextInt();
			System.out.println(integerStringLinkedHashMap.get(testSeat) + " " + integerIntegerLinkedHashMap.get(testSeat));
		}
	}
}
