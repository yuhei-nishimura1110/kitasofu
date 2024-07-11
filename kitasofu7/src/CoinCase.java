
public class CoinCase {
	private int c500;
	private int c100;
	private int c50;
	private int c10;
	private int c5;
	private int c1;

	public void AddCoins(int coin, int add) {
		switch (coin) {
		case 1 -> {
			this.c1 += add;
		}
		case 5 -> {
			this.c5 += add;
		}
		case 10 -> {
			this.c10 += add;
		}
		case 50 -> {
			this.c50 += add;
		}
		case 100 -> {
			this.c100 += add;
		}
		case 500 -> {
			this.c500 += add;
		}
		}
	}

	public int getCount(int coin) {
		int re = 0;
		switch (coin) {
		case 1 -> {
			re = this.c1;
		}
		case 5 -> {
			re = this.c5;
		}
		case 10 -> {
			re = this.c10;
		}
		case 50 -> {
			re = this.c50;
		}
		case 100 -> {
			re = this.c100;
		}
		case 500 -> {
			re = this.c500;
		}
		}
		return re;
	}

	public int getAmount() {
		int re = 0;
		re = this.c1 * 1 + this.c5 * 5 + this.c10 * 10 + this.c50 * 50 + this.c100 * 100 + this.c500 * 500;
		return re;
	}

	public int getCount() {
		int re = 0;
		re = this.c1 + this.c5 + this.c10 + this.c50 + this.c100 + this.c500;
		return re;
	}

	public int getAmount(int c) {
		int re = 0;
		switch (c) {
		case 1 -> {
			re = this.c1 * 1;
		}
		case 5 -> {
			re = this.c5 * 5;
		}
		case 10 -> {
			re = this.c10 * 10;
		}
		case 50 -> {
			re = this.c50 * 50;
		}
		case 100 -> {
			re = this.c100 * 100;
		}
		case 500 -> {
			re = this.c500 * 500;
		}
		}
		return re;
	}

}
