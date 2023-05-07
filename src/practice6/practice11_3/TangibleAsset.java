package practice6.practice11_3;

public abstract class TangibleAsset {
	String name;
	int price;
	String color;
	String isbn;
	String makerName;

	public TangibleAsset(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.color = color;

	}

	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}

	public String getColor() {
		return this.color;
	}

}