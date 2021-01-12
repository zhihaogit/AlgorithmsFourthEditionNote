package codes.chapter01.section01;

import java.util.Scanner;

/**
 * exercises
 */
public class exercises {

	public static void main(String[] args) throws Exception {
		// boolean[][] a = new boolean[2][3];
		// a[0][0] = true;
		// a[0][1] = false;
		// a[0][2] = true;
		// a[1][0] = false;
		// a[1][1] = true;
		// a[1][2] = true;

		// int b[] = { 1, 2, 3, 4, 5, 7, 8, 6, 9, 10, 11, 11, 11, 12 };

		// exercises01();
		// exercises02();
		// exercises03();
		// exercises04(1, 2, 3);
		// exercises05();
		// exercises06();
		// exercises07();
		// exercises08();
		// exercises09(1000000000);
		// exercises10();
		// exercises11(a);
		// exercises12();
		// exercises13(a);

		// System.out.println(lg(8));

		// for (int i : histogram(b, 13)) {
		// System.out.println(i);
		// }

		// System.out.println(exR1(6));
		// System.out.println(exR2(6));

		// System.out.println(mystery(2, 25));
		// System.out.println(mystery(3, 11));
		// System.out.println(mystery1(2, 25));
		// System.out.println(mystery1(3, 11));

		// for (int N = 0; N < 100; N++)
		// System.out.println(N + " " + F(N));
	}

	public static long F(int N) {
		long[] arr = new long[N + 1];
		return F(N, arr);
	}

	public static long F(int N, long[] arr) {
		if (arr[N] == 0) {
			if (N == 1) {
				arr[N] = 1;
			} else if (N > 1) {
				arr[N] = F(N - 1, arr) + F(N - 2, arr);
			}
		}
		return arr[N];
	}

	public static int mystery1(int a, int b) {
		if (b == 0)
			return 1;
		if (b % 2 == 0)
			return mystery1(a * a, b / 2);
		return mystery1(a * a, b / 2) * a;
	}

	public static int mystery(int a, int b) {
		if (b == 0)
			return 0;
		if (b % 2 == 0)
			return mystery(a + a, b / 2);
		return mystery(a + a, b / 2) + a;
	}

	public static String exR2(int n) {
		String s = exR2(n - 3) + n + exR2(n - 2) + n;
		if (n <= 0)
			return "";
		return s;
	}

	public static String exR1(int n) {
		if (n <= 0)
			return "";
		return exR1(n - 3) + n + exR1(n - 2) + n;
	}

	public static int[] histogram(int[] a, int M) {
		// 1. 按照字面意思的解法
		// int[] b = new int[M];
		// int n = 0;
		// for (int i = 0; i < M; i++) {
		// for (int j = 0; j < a.length; j++) {
		// if (i == a[j]) {
		// n++;
		// }
		// }
		// b[i] = n;
		// n = 0;
		// }
		// return b;

		// 2. 利用直方图定义解法
		int[] b = new int[M];
		int N = a.length;
		for (int i = 0; i < N; i++) {
			if (a[i] < M) {
				b[a[i]]++;
			}
		}
		return b;
	}

	public static int lg(int N) {
		System.out.println((int) (Math.log(N) / Math.log(2)));
		int result = 0;
		while (N > 1) {
			result++;
			N /= 2;
		}
		return result;
	}

	public static void exercises13(boolean[][] a) {
		int m = a.length;
		int n = a[1].length;
		boolean[][] b = new boolean[n][m];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				b[j][i] = a[i][j];
				System.out.println(b[j][i]);
			}
		}
	}

	public static void exercises12() {
		int[] a = new int[10];
		for (int i = 0; i < 10; i++)
			a[i] = 9 - i;
		for (int i = 0; i < 10; i++)
			a[i] = a[a[i]];
		for (int i = 0; i < 10; i++)
			System.out.println(i);
	}

	public static void exercises11(boolean[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j] ? '*' : ' ');
			}
		}
	}

	public static void exercises10() {
		// int a[];
		int a[] = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = i * i;
		}
	}

	public static void exercises09(int N) {
		Integer.toBinaryString(1);
		int N2 = N;

		String s = "";
		while (N != 0) {
			s = N % 2 + s;
			N /= 2;
		}
		System.out.println(s);

		String s2 = "";
		// int 二进制位数：32
		for (int n = 31; n >= 0; n--) {
			s2 += (N2 >>> n & 1);
		}
		System.out.println(s2);
	}

	public static void exercises08() {
		System.out.println('b');
		System.out.println('b' + 'c');
		System.out.println((char) ('a' + 4));
	}

	public static void exercises07() {
		// a.
		double t = 9.0;
		while (Math.abs(t - 9.0 / t) > .001)
			t = (9.0 / t + t) / 2.0;
		System.out.println(String.format("%.5f\n", t));

		// b.
		int sum = 0;
		for (int i = 0; i < 1000; i++)
			for (int j = 0; j < i; j++)
				sum++;
		System.out.println(sum);

		// c.
		int sum2 = 0;
		for (int i = 1; i < 1000; i *= 2)
			for (int j = 0; j < 1000; j++)
				sum2++;
		System.out.println(sum2);
	}

	public static void exercises06() {
		int f = 0;
		int g = 1;
		for (int i = 0; i <= 15; i++) {
			System.out.println(f);
			f = f + g;
			g = f - g;
		}
		// 菲波那切数列
		// 0
		// 1
		// 1
		// 2
		// 3
		// 5
		// 8
		// 13
		// 21
		// 34
		// 55
		// 89
		// 144
		// 233
		// 377
		// 610
	}

	public static void exercises05() {
		try (Scanner inside = new Scanner(System.in)) {
			double x = inside.nextDouble();
			double y = inside.nextDouble();
			System.out.println(x > 0 && x < 1 && y > 0 && y < 1);
		} catch (Exception e) {
			throw e;
		}
	}

	public static void exercises04(int a, int b, int c) {
		// if (a > b) then c = 0;
		// if a > b { c = 0; }
		if (a > b)
			c = 0;
		// if (a > b) c = 0 else b = 0;
	}

	public static void exercises03() {
		try (Scanner inside = new Scanner(System.in)) {
			int a = inside.nextInt();
			int b = inside.nextInt();
			int c = inside.nextInt();
			System.out.println(a == b && a == c ? "equal" : "not equal");
		} catch (Exception e) {
			throw e;
		}
	}

	public static void exercises02() {
		Object a = (1 + 2.236) / 2;
		System.out.println(a);
		System.out.println(a instanceof Double);

		Object b = 1 + 2 + 3 + 4.0;
		System.out.println(b);
		System.out.println(b instanceof Double);

		Object c = 4.1 >= 4;
		System.out.println(c);
		System.out.println(c instanceof Boolean);

		Object d = 1 + 2 + "3";
		System.out.println(d);
		System.out.println(d instanceof String);
	}

	public static void exercises01() {
		System.out.println((0 + 15) / 2); // 7
		System.out.println(2.0e-6 * 100000000.1); // 200.0000002
		System.out.println(true & false || true && true); // true
	}

}