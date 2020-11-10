package L1_009;

import java.util.Scanner;

/**
 * @author :lujianbin
 * @create :2020-11-09 20:02:00
 * @description :L1-009 N个数求和
 * @solution :将分数看做字符串进行拆分
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int fz = 0;     //分子
		int fm = 1;     //分母
		int nfz = 0;    //输入的分子
		int nfm = 0;    //输入的分母
		String fraction = ""; //输入的分数(看做字符串)
		int pos = 0;    // '/'除号的位置
		int common = 0; //记录分母的最小公倍数

		while (n-- > 0) {
			//拆分字符串获取分子分母
			fraction = scanner.next();
			pos = fraction.indexOf("/");
			nfz = Integer.parseInt(fraction.substring(0, pos));
			nfm = Integer.parseInt(fraction.substring(pos + 1));

			//欧几里得定理求最小公倍数=a*b/最大公约数
			common = fm * nfm / gcd(fm, nfm);       //将第一轮的分母和输入的分母重新进行通分

			//通分求和
			fz *= (double) common / fm;     //(最小公倍数/分母)*分子
			nfz *= (double) common / nfm;
			fz += nfz;
			fm = common;

			//化简       分子分母同时除他们的最大公约数
			nfz = fz;
			fz /= gcd(nfz, fm);
			fm /= gcd(nfz, fm);
		}

		//答案刚好是一个整数
		if (fz % fm == 0) {
			System.out.println(fz / fm);
		} else if (fz / fm == 0) {        //小于1的数,也就是不是带分数，则直接拼接打印
			System.out.println(fz + "/" + fm);
		} else {
			//如果是个带分数,先打印前方的整数
			System.out.print(fz / fm + " ");
			//再打印剩余的分数
			fz %= fm;
			System.out.println(fz + "/" + fm);
		}
	}

	//欧几里得算法求最大公约数
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
