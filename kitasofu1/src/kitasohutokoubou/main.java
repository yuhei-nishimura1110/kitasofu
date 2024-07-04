package kitasohutokoubou;

public class main {

	public static void main(String[] args) {
		// 1-1
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Hello World");

		// 1-2
		int x = 11;
		System.out.println("x=" + x);

		// 1-3
		x = 13;
		int y = 17;
		System.out.println("(x,y)=" + "(" + x + "," + y + ")");

		// 1-4
		x += y;
		System.out.println(x);

		// 1-5
		System.out.println((x - y) * y);

		// 1-6
		x = 7;
		x = x * 3;
		System.out.println(x);
		x = x / 2;
		System.out.println(x);

		// 1-7
		System.out.println("(x,y)=" + "(" + x + "," + y + ")");
		int z = 0;
		z = x;
		x = y;
		y = z;
		System.out.println("(x,y)=" + "(" + x + "," + y + ")");

		// 1-8
		x = 19;
		y = 23;
		z = x * y;
		System.out.println("z=" + z);

		// 1-9
		for (int i = 1; i < 11; i++) {
			x = x * i;
			System.out.println(x);
			x = x / i;
		}

		// 1-10
		x = 4;
		int m = x;
		for (int p = 1; p < 11; p++) {
			for (int q = 1; q < p; q++) {
				x = x * m;
			}
			System.out.println(x);
			for (int q = 1; q < p; q++) {
				x = x / m;
			}
		}

		// 1-11
		x = new java.util.Random().nextInt(100) + 3;
		y = new java.util.Random().nextInt(x - 3) + 1;
		System.out.println("(x,y)=" + "(" + x + "," + y + ")");
		System.out.println(x / y);
		System.out.println(x % y);

		// 1-12
		System.out.println(x);
		x++;
		System.out.println(x);
		x--;
		System.out.println(x);

	}

}
