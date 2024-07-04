
public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x = new java.util.Random().nextInt(19) - 9;
		int y = new java.util.Random().nextInt(19) - 9;
		System.out.println("(x,y)=(" + x + "," + y + ")");
		// 1
		if (x > y) {
			System.out.println("xはyより大きい");

		}

		// 2,3,4
		if (x > y) {
			System.out.println(x);
		} else if (x < y) {
			System.out.println(y);
		} else if (x == y) {
			System.out.println("xとyは等しい");
		}

		// 5
		if (x % 2 == 1) {
			System.out.println("奇数");
		} else if (x % 2 == 0) {
			System.out.println("偶数");
		}

		// 6
		if (x % 2 == 1) {
			if (x >= 0) {
				System.out.println("正の奇数");
			} else {
				System.out.println("負の奇数");
			}
		} else {
			if (x >= 0) {
				System.out.println("正の偶数");
			} else {
				System.out.println("負の奇数");
			}
		}

		// 7
		// ケース１
		x = new java.util.Random().nextInt(101);
		if (x >= 60) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
		// ケース２
		if (x >= 60) {
			if (x >= 80) {
				System.out.println("大変よくできました");
			} else {
				System.out.println("よくできました");
			}
		} else {
			System.out.println("残念でした");
		}
		// ケース３
		if (x >= 60) {
			if (x >= 80) {
				System.out.println("優");
			} else {
				if (x >= 70) {
					System.out.println("良");
				} else {
					System.out.println("可");
				}
			}
		} else {
			System.out.println("不可");
		}

		// 8
		y = new java.util.Random().nextInt(101);
		if ((x >= 60 && y >= 60) || (x + y >= 130) || (x + y >= 100 && (x >= 90 || y >= 90))) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}

		// 9
		System.out.println("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
		System.out.println("0=午前、1=午後、2=夜間");
		System.out.println("曜日番号を入力してください");
		x = new java.util.Scanner(System.in).nextInt();
		System.out.println("時間番号を入力してください");
		y = new java.util.Scanner(System.in).nextInt();
		int z = (x + 1) * 10 + y + 1;
		switch (z) {
		case 21, 22, 23, 32, 33, 41, 42, 51, 52, 53, 62, 63, 71 -> {
			System.out.println("開いています");
		}
		default -> {
			System.out.println("閉まっています");
		}
		}

		// 10
		if (x < y && x % 2 == 0 && y % 2 == 0) {
			System.out.println("");
		}
		if (x == y && x < 0) {
			System.out.println("");
		}
		if (x < y || x % 2 == 0) {
			System.out.println("");
		}
		if ((x >= 100 || x <= 10) && (y >= 10 && y <= 100)) {
			System.out.println("");
		}
		if (x >= 0 || y >= 0) {
			System.out.println("");
		}

		// 11
		x = new java.util.Random().nextInt(11) + 1;
		switch (x) {
		case 1 -> {
			System.out.println("元旦");
			System.out.println("成人の日");
			System.out.println("建国記念の日");
			System.out.println("春分の日");
			System.out.println("昭和の日");
			System.out.println("憲法記念日");
			System.out.println("みどりの日");
			System.out.println("こどもの日");
			System.out.println("海の日");
			System.out.println("敬老の日");
			System.out.println("秋分の日");
			System.out.println("体育の日");
			System.out.println("文化の日");
			System.out.println("敬老感謝の日");
			System.out.println("天皇誕生日");
		}
		case 2 -> {
			System.out.println("建国記念の日");
			System.out.println("春分の日");
			System.out.println("昭和の日");
			System.out.println("憲法記念日");
			System.out.println("みどりの日");
			System.out.println("こどもの日");
			System.out.println("海の日");
			System.out.println("敬老の日");
			System.out.println("秋分の日");
			System.out.println("体育の日");
			System.out.println("文化の日");
			System.out.println("敬老感謝の日");
			System.out.println("天皇誕生日");
		}
		case 3 -> {
			System.out.println("春分の日");
			System.out.println("昭和の日");
			System.out.println("憲法記念日");
			System.out.println("みどりの日");
			System.out.println("こどもの日");
			System.out.println("海の日");
			System.out.println("敬老の日");
			System.out.println("秋分の日");
			System.out.println("体育の日");
			System.out.println("文化の日");
			System.out.println("敬老感謝の日");
			System.out.println("天皇誕生日");
		}
		case 4 -> {
			System.out.println("昭和の日");
			System.out.println("憲法記念日");
			System.out.println("みどりの日");
			System.out.println("こどもの日");
			System.out.println("海の日");
			System.out.println("敬老の日");
			System.out.println("秋分の日");
			System.out.println("体育の日");
			System.out.println("文化の日");
			System.out.println("敬老感謝の日");
			System.out.println("天皇誕生日");
		}
		case 5 -> {
			System.out.println("憲法記念日");
			System.out.println("みどりの日");
			System.out.println("こどもの日");
			System.out.println("海の日");
			System.out.println("敬老の日");
			System.out.println("秋分の日");
			System.out.println("体育の日");
			System.out.println("文化の日");
			System.out.println("敬老感謝の日");
			System.out.println("天皇誕生日");
		}
		case 6, 7 -> {
			System.out.println("海の日");
			System.out.println("敬老の日");
			System.out.println("秋分の日");
			System.out.println("体育の日");
			System.out.println("文化の日");
			System.out.println("敬老感謝の日");
			System.out.println("天皇誕生日");
		}
		case 8, 9 -> {
			System.out.println("敬老の日");
			System.out.println("秋分の日");
			System.out.println("体育の日");
			System.out.println("文化の日");
			System.out.println("敬老感謝の日");
			System.out.println("天皇誕生日");
		}
		case 10 -> {
			System.out.println("体育の日");
			System.out.println("文化の日");
			System.out.println("敬老感謝の日");
			System.out.println("天皇誕生日");
		}
		case 11 -> {
			System.out.println("文化の日");
			System.out.println("敬老感謝の日");
			System.out.println("天皇誕生日");
		}
		case 12 -> {
			System.out.println("天皇誕生日");
		}
		}

		System.out.println("1~7の好きな数字を入力してください");
		x = new java.util.Scanner(System.in).nextInt();
		switch (x) {
		case 1 -> {
			System.out.println("エビがラッキーアイテム");
		}
		case 2 -> {
			System.out.println("フグがラッキーアイテム");
		}
		case 3 -> {
			System.out.println("カニがラッキーアイテム");
		}
		case 4 -> {
			System.out.println("メカジキがラッキーアイテム");
		}
		case 5 -> {
			System.out.println("アンコウがラッキーアイテム");
		}
		case 6 -> {
			System.out.println("サメがラッキーアイテム");
		}
		case 7 -> {
			System.out.println("ロブスターがラッキーアイテム");
		}
		}

		// 13
		System.out.println("月を入力してください。その月の日数を返します");
		x = new java.util.Scanner(System.in).nextInt();
		switch (x) {
		case 2 -> {
			System.out.println("28");
		}
		case 4, 6, 9, 11 -> {
			System.out.println("30");
		}
		case 1, 3, 5, 7, 8, 10, 12 -> {
			System.out.println("31");
		}
		default -> {
			System.out.println("入力が間違っています");
		}
		}
	}

}
