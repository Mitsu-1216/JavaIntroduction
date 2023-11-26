package introduction16.introduction16_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> heroes = new ArrayList<String>();
        heroes.add("deku");
        heroes.add("kacchan");
        heroes.add("ochako");
        Iterator<String> it = heroes.iterator();
        // 進められるなら繰り返す
        while (it.hasNext()) {
            // 内容を取り出す
            String e = it.next();
            System.out.println(e);
        }
    }
}