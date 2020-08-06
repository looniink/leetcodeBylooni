package leetcode_933;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author :lujianbin
 * @create :2020-08-06 14:02:00
 * @description :������������(��ʼ��û�����⣬���˴𰸲�����,��һ�����е�ͼ������)
 */
//���ش�[t-3000,t]������ping�Ĵ���
//���ö��н�ÿһ�����Ž�ȥ�����յ�һ��ʱ�� t �� ping ʱ�����ǽ���������У����ҽ�������ʱ�� t - 3000 ֮ǰ�� ping �Ƴ����С�
//Queue�ظ��������ͣ�https://blog.csdn.net/weixin_44699871/article/details/107433843
public class RecentCounter {
	public RecentCounter() {
	}

	//list��list������queue��queue��ط���
	Queue<Integer> queue = new LinkedList<Integer>();

	public int ping(int t) {
		//��ÿһ�η��ʶ�����queue
		queue.offer(t);
		if (queue.peek() < t - 3000) {      //peek/element�������ڶ���Ԫ�ص�ͷ���鿴Ԫ��
			queue.poll();                   //poll/remove������ɾ�����е�ͷ��Ԫ��
		}
		return queue.size();
	}
}
