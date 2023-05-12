package introduction.introduction15_12;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2022, 3, 26, 13, 10, 45);
        System.out.println("初めて会った日は" + c.get(Calendar.YEAR) + "年" +
                c.get(Calendar.MONTH) + "月" + c.get(Calendar.DATE) + "日です。");

        // 日時を変更(0~11から選択)
        c.set(Calendar.YEAR, 2019);
        c.set(Calendar.MONTH, 9);
        c.set(Calendar.DATE, 19);
        System.out.println("いいえ、違います。" + c.get(Calendar.YEAR) + "年" +
                c.get(Calendar.MONTH) + "月" + c.get(Calendar.DATE) + "日です。");

        Date d = c.getTime();
        System.out.println(d);

        Date now = new Date();
        // 現在日時をセット
        c.setTime(now);
        System.out.println("そして今日は" + c.get(Calendar.YEAR) + "年" +
                (c.get(Calendar.MONTH) + 1) + "月" + c.get(Calendar.DATE) + "日です。");
    }
}
