import java.util.Arrays;

public class main {
	// 1
	public static void main(String[] args) {
		int[] n = new int[10];
		String a = "[";
		for (int i = 0; i < 10; i++) {
			n[i] = new java.util.Random().nextInt(10) + 1;
			if (i < 9) {
				a += (n[i] + ",");

			} else {
				a += (n[i] + "]");
			}
		}
		System.out.println(a);

		a = "[";
		for (int i = 0; i < 10; i++) {
			n[i] *= 2;
			if (i < 9) {
				a += (n[i] + ",");
			} else {
				a += (n[i] + "]");
			}
		}
		int[] m = new int[10];

		System.out.println(a);
		// 2
		a = "[";
		for (int i = 0; i < 10; i++) {
			m[i] = n[9 - i];
			if (i < 9) {
				a += (m[i] + ",");
			} else {
				a += (m[i] + "]");
			}
		}
		System.out.println(Arrays.toString(n));

		// 3
		for (int i = 0; i < 10; i++) {
			n[i] /= 2;

		}
		a = "奇数：";
		String b = "偶数：";
		for (int i = 0; i < 10; i++) {
			if (n[i] % 2 == 1) {
				a += (n[i] + " ");
			} else {
				b += (n[i] + " ");
			}
		}
		System.out.println(a);
		System.out.println(b);
		// 4
		a = "[";
		int x = 0;
		int y = 1;
		int[] l = new int[0];
		while (x <= 100 && y <= 10) {
			int z = new java.util.Random().nextInt(100) + 1;
			z = new java.util.Random().nextInt(z) + 1;
			z = new java.util.Random().nextInt(z);
			int[] add = new int[l.length + 1];
			for (int i = 0; i < l.length; i++) {
				add[i] = l[i];
			}
			l = new int[y + 1];
			l[y] = z;
			for (int i = 0; i < l.length - 1; i++) {
				l[i] = add[i];
			}
			x = 0;
			for (int i = 0; i < l.length; i++) {
				x += l[i];
			}
			System.out.println(x);
			y++;
		}
		for (int i = 0; i < l.length; i++) {
			if (l.length - 1 != i) {
				a += (l[i] + ",");
			} else {
				a += (l[i] + "]");
			}
		}
		System.out.println(a);
		// 5
		a = "";
		x = 0;
		y = 1;
		int k = 1;
		int z = new java.util.Random().nextInt(101);
		System.out.println(z);
		while (z > 0) {
			if (z % 2 == 1) {
				a = "1" + a;
				z -= 1;
				z /= 2;
			} else {
				a = "0" + a;
				z /= 2;
			}
			k++;
		}
		System.out.println(a);
		// 6

		int kuku[][] = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				kuku[i][j] = (i + 1) * (j + 1);
			}
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.printf("%3d", kuku[i][j]);

			}
			System.out.println();
		}

		// 7
		int[] kk = new int[2];
		for (int i = 0; i < 2; i++) {
			kk[i] = new java.util.Random().nextInt(8) + 1;
		}
		System.out.println(Arrays.toString(kk));
		System.out.println(kuku[kk[0] - 1][kk[1] - 1]);
		// 8
		int num[] = new int[10];
		for (int i = 0; i < 9; i++) {
			num[i] = new java.util.Random().nextInt(100);
		}
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));

	}

}
