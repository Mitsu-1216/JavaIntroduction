package practice.practice6.practice11_3;

public class Computer extends TangibleAsset {
	String makerName;

	public Computer(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}

	public String getIsbn() {
		return this.makerName;
	}

}
