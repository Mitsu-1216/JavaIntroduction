package introduction.introduction15_12;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2022, 3, 26, 13, 10, 45);
        System.out.println("初めて会った日は" + c.getTime() + "です。");

        // 月を変更(0~11から選択) /
        c.set(Calendar.YEAR, 2019);
        c.set(Calendar.MONTH, 9);
        c.set(Calendar.DATE, 19);
        Date d = c.getTime();
        System.out.println(d);

        // Dateインスタンスからint値を生成
        Date now = new Date();
        c.setTime(now);
        int y = c.get(Calendar.YEAR); /* 年を取り出す */
        System.out.println("今年は" + y + "年です！");
    }
}
