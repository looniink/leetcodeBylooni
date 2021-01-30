package leetcode_501;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :lujianbin
 * @create :2021-01-30 11:33:00
 * @description :二叉搜索树中的众数
 * @solution :
 */
public class leetcode_501 {
	List<Integer> answer = new ArrayList<Integer>();
	//base:记录当前数字，count:记录当前数字重复的次数，maxCount:众数
	int base, count, maxCount;

	public int[] findMode(TreeNode root) {
		dfs(root);
		int[] mode = new int[answer.size()];
		for (int i = 0; i < answer.size(); ++i) {
			mode[i] = answer.get(i);
		}
		return mode;
	}

	public void dfs(TreeNode o) {
		if (o == null) {
			return;
		}
		dfs(o.left);
		update(o.val);  //在中序遍历的时候利用原数据直接进行判断
		dfs(o.right);
	}

	//在中序遍历中进行，也就是在递增序列中进行
	//base:记录当前数字，count:记录当前数字重复的次数，maxCount:出现最多的那个数字出现的次数
	public void update(int x) {
		if (x == base) {    //如果下一个数字和当前的数字相等则count+1
			++count;
		} else {
			count = 1;      //如果不相等则将count复位为1
			base = x;       //将base更新为当前数字
		}
		if (count == maxCount) {    //说明该数字出现的次数等于当前众数出现的次数，将base加入answer数组
			answer.add(base);
		}
		if (count > maxCount) {    //说明当前的这个数字出现的次数大于当前众数出现的次数
			maxCount = count;      //更新maxCount为当前这个数的count
			answer.clear();        //清空answer集合
			answer.add(base);      //将当前这个数放入集合
		}
	}
}

