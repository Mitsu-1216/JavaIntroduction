package introduction;

public class introduction6_10 {
	public static void main(String[] args) {

		int[] heights = { 120, 130, 340, 750, 880 };
		// 自動で並び変えてくれるAPI
		java.util.Arrays.sort(heights);

		for (int h : heights) {
			System.out.println(h);
		}

	}

}