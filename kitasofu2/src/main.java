import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		// 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(s);

		// 2
		int x = Integer.parseInt(s);
		System.out.println(x);

		// 3
		int y = x;
		for (int p = 1; p < 4; p++) {
			for (int q = 1; q < p; q++) {
				x = x * y;
			}
			System.out.println(x);
			for (int q = 1; q < p; q++) {
				x = x / y;
			}
		}

		// 4
		BufferedReader by = new BufferedReader(new InputStreamReader(System.in));
		String sy = by.readLine();
		y = Integer.parseInt(sy);
		System.out.println("和は" + x + y);
		System.out.println("差は" + (x - y));
		System.out.println("積は" + x * y);
		System.out.println("商は" + x / y);
		System.out.println("余りは" + x % y);

		// 5
		System.out.println("平均値は" + (x + y) / 2);

		System.out.println("年齢を教えて下さい");
		BufferedReader bn = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bn.readLine());
		int m = n * 365;
		System.out.println("生を授かってから" + m + "日");
	}

}
