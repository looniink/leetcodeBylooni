package S_5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author :lujianbin
 * @create :2020-11-19 19:11:00
 * @description :判断题
 * @solution :
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int people = scanner.nextInt();
		int subjects = scanner.nextInt();
		scanner.nextLine();
		//每道题的分数集合
		int[] scores = new int[subjects];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = scanner.nextInt();
		}

		//每道题的答案
		int[] trueAnswer = new int[subjects];
		for (int i = 0; i < trueAnswer.length; i++) {
			trueAnswer[i] = scanner.nextInt();
		}

		scanner.nextLine();
		ArrayList<String> list = new ArrayList<>();

		//存每个学生的答案
		for (int i = 0; i < people; i++) {
			list.add(scanner.nextLine());
		}

		for (int i = 0; i < list.size(); i++) {
			int sum = 0;
			String[] split = list.get(i).split(" ");
			for (int j = 0; j < subjects; j++) {
				if (trueAnswer[j] == Integer.parseInt(split[j])) {
					sum += scores[j];
				}
			}
			System.out.println(sum);
		}
	}
}
