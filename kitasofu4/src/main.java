
public class main {
	public static void main(String[] arge) {
		// 1
		for (int i = 0; i < 10; i++) {
			System.out.println("SPAM");
		}

		// 2
		int x = 0;
		for (int i = 0; i < 9; i++) {
			x += 3;
			System.out.println(x);
		}

		// 3
		x = 1;
		for (int i = 0; i < 8; i++) {
			x = x * 2;
			System.out.println(x);
		}

		// 4
		x = 1;
		for (int i = 1; i < 8; i++) {
			x = x * i;
			System.out.println(x);
		}

		// 5
		int y = 0;
		for (int i = 1; i <= 10; i++) {
			x = new java.util.Random().nextInt(101);
			y = y + x;

		}
		y = y / 10;
		System.out.println("平均値は" + y);

		// 6
		y = 0;
		for (int i = 0; i <= 10; i++) {
			x = new java.util.Random().nextInt(2);
			y = y + x;
		}
		System.out.println(y + "勝" + (10 - y) + "敗");
		// 7
		int z = 0;
		y = 0;
		for (int i = 0; i <= 9; i++) {
			x = new java.util.Random().nextInt(5);
			y = y + x;
			x = new java.util.Random().nextInt(5);
			z = z + x;
		}
		if (y > z) {
			System.out.println("巨人の勝ち");
		} else if (z > y) {
			System.out.println("阪神の勝ち");
		} else if (z == y) {
			System.out.println("引き分け");
		}
		// 8&9

		y = 0;
		z = 100;
		for (int i = 0; i <= 10; i++) {
			x = new java.util.Random().nextInt(101);
			if (y < x) {
				y = x;
			}
			if (z > x) {
				z = x;
			}
		}
		System.out.println("最大値" + y);
		System.out.println("最小値" + z);

		// 10
		x = new java.util.Random().nextInt(100) + 1;
		String a = "";
		for (int i = 1; i <= x; i++) {
			a = a + "*";
		}
		System.out.println(a);

		// 11
		x = new java.util.Random().nextInt(101);
		String b = "";
		for (int i = 0; i <= x; i++) {
			y = i % 10;
			b += y;
		}
		System.out.println(b);

		// 12
		int k = 0;
		while (k < 100) {
			x = new java.util.Random().nextInt(101) + 1;
			y = new java.util.Random().nextInt(x) + 1;
			z = new java.util.Random().nextInt(y);
			System.out.println(z);
			k += z;

		}

		// 13
		x = 0;
		y = 0;
		while (x <= 3 || y <= 4) {
			z = new java.util.Random().nextInt(2);
			if (z == 0) {
				x++;
			} else if (z == 1) {
				y++;
			}
		}
		System.out.println(x + "ストライク" + y + "ボール");

		// 14
		x = 0;
		y = 0;
		while (x <= 3 || y <= 4) {
			z = new java.util.Random().nextInt(3);
			if (z == 0) {
				x++;
			} else if (z == 1) {
				y++;
			} else if (z == 2 && x != 2) {
				y++;
			}
		}
		System.out.println(x + "ストライク" + y + "ボール");

		// 15
		x = new java.util.Random().nextInt(1000000) + 1;
		System.out.println(x);
		y = 1;
		if (x == 1) {
			System.out.println("素数ではない");
		} else {
			while (y < x) {
				y++;
				if (x % y == 0) {
					System.out.println("素数ではない");
					y = x + 1;
				}

			}
			if (y == x) {
				System.out.println("素数である");
			}
		}

		// 16
		x = new java.util.Random().nextInt(1000000) + 1;
		System.out.println(x);

		y = 2;
		a = "";
		if (x == 1) {
			a = "1";

		} else if (x == 2) {
			a = "2";
		} else {
			while (x > 1) {
				if ((x % y) == 0) {
					a = a + y + " ";
					x = x / y;
				} else {
					y++;
				}
			}
		}
		System.out.println(a);
		// 17
		String c = "";
		for (int m = 1; m <= 9; m++) {
			for (int n = 1; n <= 9; n++) {
				x = n * m;
				c += x;
			}
			c += "\n";
		}
		System.out.println(c);
		// 18,19
		x = 0;
		y = 0;
		z = 0;
		int n = 0;
		while (y == 0) {
			int s = new java.util.Random().nextInt(101);
			z = z * n;
			x += s;
			z += s;
			n++;
			if (s == 0) {
				y++;
				n++;
			}
			z = z / n;
		}
		System.out.println(x);
		System.out.println(z);

		// 20
		a = "";
		int s = new java.util.Random().nextInt(10) + 1;
		for (int i = 1; i <= s; i++) {
			for (int p = 0; p <= s - i; p++) {
				a += " ";
			}
			for (int q = 1; q <= 2 * i - 1; q++) {
				a += "$";
			}
			a += "\n";
		}
		System.out.println(a);
		// 21
		a = "";
		s = new java.util.Random().nextInt(10) + 1;
		for (int i = 1; i <= s; i++) {
			for (int p = 1; p <= s; p++) {
				if ((p == i) || (p == s - i + 1)) {
					a += "X";
				} else {
					a += " ";
				}

			}
			a += "\n";
		}
		System.out.println(a);
		// 22
		x = 0;
		y = 1;
		a = "0,1";
		do {
			y = x + y;
			a += ("," + y);
			x = y - x;
		} while (y < 1000);
		System.out.println(a);
	}
}
