package leetcode_496;

/**
 * @author :lujianbin
 * @create :2020-08-11 12:34:00
 * @description :
 */
public class test_496 {
	public static void main(String[] args) {
		int[] num1 = {4, 1, 2};
		int[] num2 = {1, 3, 4, 2};
		main_496 main_496 = new main_496();
		int[] res = main_496.nextGreaterElement(num1, num2);

		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + ",");
		}
	}
}
