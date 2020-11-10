package L1_009;

import java.util.Scanner;

/**
 * @author :lujianbin
 * @create :2020-11-09 20:02:00
 * @description :L1-009 N�������
 * @solution :�����������ַ������в��
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int fz = 0;     //����
		int fm = 1;     //��ĸ
		int nfz = 0;    //����ķ���
		int nfm = 0;    //����ķ�ĸ
		String fraction = ""; //����ķ���(�����ַ���)
		int pos = 0;    // '/'���ŵ�λ��
		int common = 0; //��¼��ĸ����С������

		while (n-- > 0) {
			//����ַ�����ȡ���ӷ�ĸ
			fraction = scanner.next();
			pos = fraction.indexOf("/");
			nfz = Integer.parseInt(fraction.substring(0, pos));
			nfm = Integer.parseInt(fraction.substring(pos + 1));

			//ŷ����ö�������С������=a*b/���Լ��
			common = fm * nfm / gcd(fm, nfm);       //����һ�ֵķ�ĸ������ķ�ĸ���½���ͨ��

			//ͨ�����
			fz *= (double) common / fm;     //(��С������/��ĸ)*����
			nfz *= (double) common / nfm;
			fz += nfz;
			fm = common;

			//����       ���ӷ�ĸͬʱ�����ǵ����Լ��
			nfz = fz;
			fz /= gcd(nfz, fm);
			fm /= gcd(nfz, fm);
		}

		//�𰸸պ���һ������
		if (fz % fm == 0) {
			System.out.println(fz / fm);
		} else if (fz / fm == 0) {        //С��1����,Ҳ���ǲ��Ǵ���������ֱ��ƴ�Ӵ�ӡ
			System.out.println(fz + "/" + fm);
		} else {
			//����Ǹ�������,�ȴ�ӡǰ��������
			System.out.print(fz / fm + " ");
			//�ٴ�ӡʣ��ķ���
			fz %= fm;
			System.out.println(fz + "/" + fm);
		}
	}

	//ŷ������㷨�����Լ��
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
