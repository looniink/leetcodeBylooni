package leetcode_1544;


/**
 * @author :lujianbin
 * @create :2020-08-18 11:25:00
 * @description :
 */
public class main_1544 {
	public String makeGood(String s) {
		StringBuffer res = new StringBuffer();
		for (char c : s.toCharArray()) {
			if (res.length() != 0 && satisfy(res.charAt(res.length() - 1), c)) {
				res.deleteCharAt(res.length() - 1);
			} else {
				res.append(c);
			}
		}
		return res.toString();
	}

	public boolean satisfy(char a, char b) {
		//小写字母比大写字母的Ascall码值多32
		return Math.abs(a - b) == 32;
	}

}
