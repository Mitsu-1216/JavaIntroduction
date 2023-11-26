package practice6.practice12_2;

public abstract class Character {
	String name;
	int hp;

	public void run() {
		System.out.println("走り出した！");
	}

	public abstract void attack(Matango m);

}