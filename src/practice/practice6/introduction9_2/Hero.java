package practice6.introduction9_2;

public class Hero {
	// フィールドを追加
	String name;
	int hp;

	// thisは「自分自身のをインスタンス」の意味
	// thisは省略しても動くが、明示的につけること
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}

}
