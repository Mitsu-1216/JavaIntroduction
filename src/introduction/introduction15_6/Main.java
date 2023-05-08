package introduction.introduction15_6;

public class Main {
    public static void main(String[] args) {

        String name = "ZZAZA000";
        System.out.println(isValidPlayerName(name));

    }

    public static boolean isValidPlayerName(String name) {
        // 8文字
        // 先頭の文字はA~Z
        // 以降の文字はA~Z0~9
        return name.matches("[A-Z][A-Z0-9]{7}");
    }

}
