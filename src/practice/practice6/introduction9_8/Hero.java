package practice.practice6.introduction9_8;

public class Hero {
	String name;
	int hp;

	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}

	// コンストラクタ
	public Hero() {
		this.hp = 100;
	}

	// コンストラクタのオーバーロード
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}
}
