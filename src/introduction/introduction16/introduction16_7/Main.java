package introduction.introduction16.introduction16_7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // HaashMap生成
        Map<String,Integer> prefs = new HashMap<String,Integer>();
       
        // ペアで値を格納
        prefs.put("京都府",38);
        prefs.put("大阪府",24);
        prefs.put("奈良県",32);

        for(String key:prefs.keySet()){
            int value = prefs.get(key);
            System.out.println(key + "のラッキーナンバーは" + value);
        }
    }
}
