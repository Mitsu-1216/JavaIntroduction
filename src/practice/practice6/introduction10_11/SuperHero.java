package practice.practice6.introduction10_11;

public class SuperHero extends Hero {
	boolean flying;

	public SuperHero() {
		// 自動的にsuper();が挿入される
		super();
		System.out.println("SuperHeroのコンストラクタが動作");
	}

}
