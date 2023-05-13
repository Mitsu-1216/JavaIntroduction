package introduction16.introduction16;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        // リストに追加
        names.add("梅雨ちゃん");
        names.add("お茶子ちゃん");
        names.add("やおもも");
        names.add("葉隠さん");
        names.add("みなちゃん");
        names.add("耳郎ちゃん");

        System.out.println(names.get(1));

        // リストをループさせる
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

    }
}
