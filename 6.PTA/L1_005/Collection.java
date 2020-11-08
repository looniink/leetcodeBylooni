package L1_005;

import java.util.*;

/**
 * @author :lujianbin
 * @create :2020-11-07 17:15:00
 * @description :
 */
public class Collection {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		for (int i = 0; i < 100; i++) {
			linkedList.add(i);
			arrayList.add(i + 1);
			linkedHashSet.add(i + 2);
		}

		//获取迭代器
		Iterator<Integer> iterator = linkedList.iterator();
		//判断元素是否存在
		while (iterator.hasNext()) {
			//打印元素
			System.out.print(iterator.next() + " ");
		}

		System.out.println();


		//linkedList
		Iterator<Integer> iterator1 = linkedHashSet.iterator();
		//LinkedList 特有的方法：CRUD首尾元素
		System.out.println(linkedList.getLast());

		while (iterator1.hasNext()) {
			System.out.print(iterator1.next() + "-");
		}

		System.out.println();

		//iter快捷键的使用 && foreach循环
		for (Integer integer : linkedHashSet) {
			System.out.print(integer + "*");
		}

		System.out.println();

		String[] arr = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
		for (String s : arr) {
			System.out.print(s);
		}


	}
}
