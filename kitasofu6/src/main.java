import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// 1
		int a = new java.util.Random().nextInt(101);
		System.out.println(a);
		int resultA = A_1(a);
		System.out.println(resultA);

		// 2
		int b = new java.util.Random().nextInt(101);
		System.out.println(b);
		int result_B = ave(a, b);
		System.out.println(result_B);

		// 3
		int c = new java.util.Random().nextInt(101);
		System.out.println("[" + a + "," + b + "," + c + "]");
		int result_c = max(max(a, b), c);
		System.out.println("３つの数の中で最も大きいのは" + result_c);

		// 4
		a = new java.util.Random().nextInt(10) + 1;
		String o = triangle(a);
		System.out.println(o);

		// 5
		a = new java.util.Random().nextInt(10) + 1;
		String k[] = new String[] { "$", "%", "&", "#", "▲", "▼", "★", "♥", "\\", "@" };
		b = new java.util.Random().nextInt(10);
		String oo = triangle(a, k[b]);
		System.out.println(oo);

		// 6
		a = new java.util.Random().nextInt(9) + 1;
		int[] result_6 = kuku(a);
		System.out.println(Arrays.toString(result_6));

		// 7
		int[] result_7 = new int[101];
		int count = 0;
		for (int i = 10000; i <= 10100; i++) {
			int l = sosuu(i);
			if (l == 1) {
				result_7[count] = i;
				count++;
			}
		}

		for (int i = 0; i <= count - 1; i++) {
			System.out.println(result_7[i]);
		}

		// 8
		int f = new java.util.Random().nextInt(20);
		int x = 0;
		int y = 1;
		int z = 0;
		for (int i = 0; i < f; i++) {
			int n = fiv(x, y);
			x = n;
			y = n - y;
		}
		System.out.println(x);
	}

	// 1
	public static int A_1(int a) {
		int aa = 0;
		aa = a * a;
		return aa;
	}

	// 2
	public static int ave(int a, int b) {
		int sum = a + b;
		int ave = sum / 2;
		return ave;
	}

	// 3
	public static int max(int a, int b) {
		int c = 0;
		if (a > b) {
			c = a;
		} else if (a <= b) {
			c = b;
		}
		return c;
	}

	// 4
	public static String triangle(int a) {
		String b = "";
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a - i; j++) {
				b += " ";
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				b += "▲";
			}
			b += "\n";
		}
		return b;

	}

	// 5
	public static String triangle(int a, String c) {
		String b = "";
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a - i; j++) {
				b += " ";
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				b += c;
			}
			b += "\n";
		}
		return b;

	}

	// 6
	public static int[] kuku(int a) {
		int[] haire = new int[9];
		for (int i = 1; i < 10; i++) {
			haire[i - 1] = i * a;
		}
		return haire;
	}

	// 7
	public static int sosuu(int a) {
		int re = 0;
		int b = 2;
		if (a == 1) {
		} else if (a == 2) {
			re = 1;
		} else {
			while (a > b) {
				if (a % b == 0) {
					b++;
					b = a + 1;
				} else {
					b++;
				}

			}

			if (b == a) {
				re = 1;
			}
		}
		return re;

	}

	// 8
	/*
	 * public static int fiv(int x) { int y = 0; int z = 1; int c = 2; if (x == 0) {
	 * z = 0; } else if (x == 1) { z = 1; } else { while (c <= x) { z += y; y = z -
	 * y; c++; } } return z; }
	 */
	public static int fiv(int x, int y) {
		int re = x + y;
		return re;
	}
}
