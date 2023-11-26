package practice6.introduction10_8;

public class SuperHero extends Hero {

	boolean flying;

	// 飛ぶ
	public void fly(Matango m) {
		this.flying = true;
		System.out.println("飛び上がった！");
	}

	// 着地
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}

	// 逃げる(オーバーライド)
	public void run() {
		System.out.println(this.name + "は撤退した！");
	}

	// 攻撃(オーバーライド)
	// 飛んでいる状態でのみ、2回目の攻撃をする
	// attackを直書きで5ポイントと記載してるため、
	// 親クラスの変更があった際、こちらも変更しなければならない
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた！");

		if (this.flying) {
			System.out.println(this.name + "の攻撃！");
			m.hp -= 5;
			System.out.println("5ポイントのダメージをあたえた！");
		}
	}

}
