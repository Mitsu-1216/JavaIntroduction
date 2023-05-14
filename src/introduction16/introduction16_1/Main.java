package introduction16.introduction16_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // ArrayListの宣言
        // Integer型のインスタンスを保持
        ArrayList<Integer> nums = new ArrayList<Integer>();

        // リストに追加
        nums.add(3);
        nums.add(32);
        nums.add(324);

        // リストをループ
        for (int i : nums) {
            System.out.println(i);
        }

    }
}
