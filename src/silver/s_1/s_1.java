package silver.s_1;


public class s_1 {
	public static final void main(String[] args) {

		int isHungry = 1;
		String food = "いちご";
		System.out.println("こんにちは");

		if (isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("はらぺこです");
		}

		if (isHungry != 0) {
			System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまでした");

	}
}
