package practice.practice6.introduction9_8;

public interface Main {
    public static void main(String[] args) {

        // コンストラクタ
        Hero h1 = new Hero();
        h1.name = "ミナト";

        // 引数ありのコンストラクタ
        Hero h2 = new Hero("アサカ");

        System.out.println(h1.name + h1.hp);
        System.out.println(h2.name + h2.hp);

    }
}
