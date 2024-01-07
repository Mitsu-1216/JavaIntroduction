package introduction.introduction15.introduction15_13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
        public static void main(String[] args) throws Exception {
                SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                // 文字列からDateインスタンスを生成
                Date d = f.parse("2023/05/13 12:13:45");
                System.out.println(d);
                // Dateインスタンスから文字列を生成
                Date now = new Date();
                String s = f.format(now);
                System.out.println("今日は" + s + "です");
        }
}
