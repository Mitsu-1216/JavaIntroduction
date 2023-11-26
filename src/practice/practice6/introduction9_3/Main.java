package practice6.introduction9_3;

public interface Main {
    public static void main(String[] args) {
        Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;
        Hero h = new Hero();
        h.name = "ミナト";
        h.hp = 100;
        // HeroクラスがSwordクラスをフィールドとして利用
        // has-aの関係
        h.sword = s;

        System.out.println("現在の武器は" + h.sword.name);
    }
}
