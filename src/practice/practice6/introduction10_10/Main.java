package practice.practice6.introduction10_10;

public interface Main {
    public static void main(String[] args) {
        // すべてのコンストラクタはその先頭で必ず親クラスのコンストラクタを呼び出す
        Weapon w = new Weapon();
        System.out.println(w.name + w.price);
    }
}
