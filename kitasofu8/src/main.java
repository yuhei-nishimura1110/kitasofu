
public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Cat c = new Cat();
		c.Name = "きよはる";
		c.Age = 5;
		c.ShowProfile();
		c.sleep();
		c.Speak();

		Dog d = new Dog();
		d.Name = "ポチ";
		d.Age = 2;
		d.ShowProfile();
		d.run();
		d.Speak();

		Animal[] ani = new Animal[4];
		for (int i = 0; i < 4; i++) {
			if (i % 2 == 0) {
				ani[i] = new Cat();
			} else {
				ani[i] = new Dog();
			}
		}
		for (Animal aniani : ani) {
			aniani.Speak();
		}
	}

}
