package introduction.introduction15.introduction15_7;

public class Main {
    public static void main(String[] args) {
        String s = "abc,def:ghi";
        // 1つの文字列を複数に分割
        String[] words = s.split("[,:]");
        for (String w : words) {
            System.out.print(w + "->");
        }
    }
}
