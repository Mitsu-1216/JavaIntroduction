package practice6.practice10_3;

public interface Main {
    public static void main(String[] args) {
        // すべてのコンストラクタはその先頭で必ず親クラスのコンストラクタを呼び出す
        PoisonMatango pm = new PoisonMatango('A');

    }
}
