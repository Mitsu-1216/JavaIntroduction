package practice.practice6.introduction9_16;

public class Hero {
	String name;
	int hp;

	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}

	// コンストラクタ①
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}

	// コンストラクタ②
	public Hero() {
		// コンストラクタ①を呼び出したいが、
		// エラーになってしまう
		// this.Hero("ダミー");

		// 同一クラスの別コンストラクタを呼び出す
		this("ダミー");
	}

}
