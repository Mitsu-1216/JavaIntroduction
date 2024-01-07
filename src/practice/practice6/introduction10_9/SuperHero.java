package practice.practice6.introduction10_9;

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
	public void attack(Matango m) {
		// 親インスタンス部分のattack()呼び出し
		// 直書きしないので、親インスタンス部分が修正されても、
		// こちらはそのままで良い
		super.attack(m);
		if (this.flying) {
			// 親インスタンス部分のattack()呼び出し
			super.attack(m);
		}
	}

}
