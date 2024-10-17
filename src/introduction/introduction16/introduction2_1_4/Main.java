package introduction.introduction16.introduction2_1_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append("Java");
            sb.append("は");
            sb.append("楽しい");
        }

        String s = sb.toString();
        System.out.println(s);

    }
}
