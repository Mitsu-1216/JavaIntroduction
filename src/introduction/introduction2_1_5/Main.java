package introduction.introduction2_1_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append("Java").append("は").append("楽しい");
        }

        String s = sb.toString();
        System.out.println(s);

    }
}
