package leetcode_1047;

/**
 * @author :lujianbin
 * @create :2020-08-16 18:43:00
 * @description :删除字符串中相邻的重复项
 */
public class main_1047 {
	//stringbuffer解决方案
	public String removeDuplicates(String S) {
		StringBuffer res = new StringBuffer();
		int size = 0;
		for (int i = 0; i < S.length(); i++) {
			//如果两个相同就将res里面的元素
			if (size != 0 && res.charAt(size - 1) == S.charAt(i))
				res.deleteCharAt(--size);
			else {
				//如果没有重复项则将该元素追加到res中
				res.append(S.charAt(i));
				size++;
			}
		}
		return res.toString();
	}
}
