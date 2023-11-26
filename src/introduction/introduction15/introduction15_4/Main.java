package introduction.introduction15_4;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append("Java");
            sb.append("Script");
        }
        // 連結住み文字列を取り出す
        String s = sb.toString();
        System.out.println(s);
    }

}
