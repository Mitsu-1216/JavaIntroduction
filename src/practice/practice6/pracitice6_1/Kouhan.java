package practice.practice6.pracitice6_1;

public class Kouhan {

	static void callDeae() {
		System.out.println("えぇい、こしゃくな。曲者だ！であえい！");
	}

	static void showMondokoro() throws Exception {

		System.out.println("飛車さん、角さん。もういいでしょう。");
		System.out.println("この紋所が目に入らぬか！");
		// 3秒の待ち時間
		Thread.sleep(3000);
		Zenhan.doTogame();

	}
}