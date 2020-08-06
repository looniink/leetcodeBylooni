package leetcode_933;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author :lujianbin
 * @create :2020-08-06 14:02:00
 * @description :最近的请求次数(开始真没读懂题，看了答案才明白,画一个队列的图很清晰)
 */
//返回从[t-3000,t]的所有ping的次数
//利用队列将每一个都放进去，当收到一个时间 t 的 ping 时，我们将它加入队列，并且将所有在时间 t - 3000 之前的 ping 移出队列。
//Queue重复方法解释：https://blog.csdn.net/weixin_44699871/article/details/107433843
public class RecentCounter {
	public RecentCounter() {
	}

	//list用list方法，queue用queue相关方法
	Queue<Integer> queue = new LinkedList<Integer>();

	public int ping(int t) {
		//将每一次访问都存入queue
		queue.offer(t);
		if (queue.peek() < t - 3000) {      //peek/element方法：在队列元素的头部查看元素
			queue.poll();                   //poll/remove方法：删除队列的头部元素
		}
		return queue.size();
	}
}
