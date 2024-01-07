package introduction.introduction15.introduction15_8;

public class Main {
    public static void main(String[] args) {
        String s = "abc,def:ghi";
        // 1つの文字列を複数に分割
        // behをXに置き換える
        String w = s.replaceAll("[beh]", "X");
        System.out.println(w);
    }
}
