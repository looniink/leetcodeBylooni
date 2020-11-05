package L1_003;

import java.util.Scanner;

/**
 * @author :lujianbin
 * @create :2020-11-04 20:44:00
 * @description :字符串
 * @solution :
 */
public class String {
	public static void main(java.lang.String[] args) {
		Scanner scanner = new Scanner(System.in);
		java.lang.String s = scanner.nextLine();
		char[] chars = s.toCharArray();
		System.out.println(s.charAt(3));        //字符串从0开始
		System.out.println(s.contains("l"));    //判断是是否包含
		System.out.println(s.endsWith("x"));    //判断是否以n结尾，start with同理
		System.out.println(s.replaceAll("l", "-----")); //替换所有内容，replace first类似
		System.out.println(s.substring(1, 2));  //指定截取内容
		System.out.println(s.trim());           //去掉所有的空格
		System.out.println(s.toUpperCase() + "+++++++++++++" + s.toLowerCase());    //转大小写

		//stringBuffer线程安全, 两个sb都可以修改内容(append)
		StringBuilder s2 = new StringBuilder(s);
		//CRUD
		System.out.println(s2.append("hello"));
		System.out.println(s2.deleteCharAt(1));
		System.out.println(s2.insert(1, "你好"));
		System.out.println(s2.reverse());

	}
}
