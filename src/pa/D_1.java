package pa;

import java.util.stream.Stream;

public class D_1 {
    public static void main(String[] args) {
        String num = "1 2 3 4 5";
        String[] sArray = num.split(" ");
        
        // String型配列 を int型配列 に変換
        int[] iArray = Stream.of(sArray).mapToInt(Integer::parseInt).toArray();

        int count = iArray[2];
        System.out.println(count * 2);
    }
}

