package practice.practice6.practice9_1;

public class Thief {
	String name;
	int hp;
	int mp;

	// 冗長性のあるコードになってしまう
	// public Thief(String name) {
	// this.name = name;
	// this.hp = 40;
	// this.mp = 5;
	// }

	// public Thief(String name, int hp) {
	// this.name = name;
	// this.hp = hp;
	// this.mp = 5;
	// }

	public Thief(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	public Thief(String name, int hp) {
		this(name, hp, 5);

	}

	public Thief(String name) {
		this(name, 40);

	}
}
