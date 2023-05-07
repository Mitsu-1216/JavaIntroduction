package practice6.practice8_1;

public class Cleric {
	String name;
	int hp = 50;
	final int MAXHP = 50;
	int mp = 10;
	final int MAXMP = 10;

	public void selfAid() {
		this.mp -= 5;
		this.hp = this.MAXHP;
	}

	public int pray(int second) {
		int recover = second + new java.util.Random().nextInt(3);
		if (recover > MAXMP) {
			recover = MAXMP;
		}
		return recover;
	}

}
