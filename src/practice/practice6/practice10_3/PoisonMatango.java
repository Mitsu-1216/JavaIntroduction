package practice.practice6.practice10_3;

public class PoisonMatango extends Matango {
	public PoisonMatango(char suffix) {
		super(suffix);
	}

	int zan = 5;

	public void attack(Hero h) {
		super.attack(h);
		if (this.zan > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int doku = h.hp / 5;
			h.hp -= doku;
			System.out.println(doku + "ポイントのダメージ！");
			this.zan--;
		}
	}
}