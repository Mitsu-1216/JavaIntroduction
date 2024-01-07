package introduction.introduction16.introduction16_6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // HaashMap生成
        Map<Strirng,Integer> prefs = new HashMap<String,Integer>();
       
        // ペアで値を格納
        prefs.put("京都府",38);
        prefs.put("大阪府",24);
        prefs.put("奈良県",32);

        // 値を取得
        int osaka = prefs.get("大阪府");
        System.out.println("大阪のラッキーナンバーは" + osaka);

    }
}
