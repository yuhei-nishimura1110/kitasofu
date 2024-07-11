
class Dog {
	// 1
	private String Name;
	// 2
	private int Age;
	// 4
	private String Kind;

	// 1
	public void SetName(String nm) {
		this.Name = nm;
	}

	// 2
	public void SetAge(int ag) {
		this.Age = ag;
	}

	// 4
	public Dog(String ki) {
		this.Kind = ki;
	}

	// 1/2/4
	public void ShowProfile() {
		System.out.println("名前は、" + this.Name + "です。");
		System.out.println("年齢は、" + this.Age + "歳です。");
		System.out.println("この犬の犬種は、" + this.Kind + "です。");
	}

}
