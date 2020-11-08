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

		//��ȡ������
		Iterator<Integer> iterator = linkedList.iterator();
		//�ж�Ԫ���Ƿ����
		while (iterator.hasNext()) {
			//��ӡԪ��
			System.out.print(iterator.next() + " ");
		}

		System.out.println();


		//linkedList
		Iterator<Integer> iterator1 = linkedHashSet.iterator();
		//LinkedList ���еķ�����CRUD��βԪ��
		System.out.println(linkedList.getLast());

		while (iterator1.hasNext()) {
			System.out.print(iterator1.next() + "-");
		}

		System.out.println();

		//iter��ݼ���ʹ�� && foreachѭ��
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
