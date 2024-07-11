import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 1/4
		Dog dog = new Dog("秋田犬");
		dog.SetName("シロ");
		// 2
		dog.SetAge(5);
		// 4

		// 1/2/4
		dog.ShowProfile();

		// 3/4
		Dog dog2 = new Dog("柴犬");
		dog2.SetName("クロ");
		dog2.SetAge(5);
		;
		dog2.ShowProfile();

		// 5
		CoinCase c = new CoinCase();
		int[] coin = new int[] { 1, 5, 10, 50, 100, 500 };
		for (int i = 0; i < 10; i++) {
			int x = new java.util.Random().nextInt(6);
			int y = new java.util.Random().nextInt(10);
			c.AddCoins(coin[x], y);

		}
		int[] result = new int[6];
		for (int i = 0; i < 6; i++) {
			result[i] = c.getCount(coin[i]);
		}
		System.out.println(Arrays.toString(coin));
		System.out.println(Arrays.toString(result));
		System.out.println(c.getCount());
		System.out.println(c.getAmount());
	}
}
