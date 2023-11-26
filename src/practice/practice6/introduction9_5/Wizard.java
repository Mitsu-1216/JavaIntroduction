package practice6.introduction9_5;

public class Wizard {
    String name;
    int hp;

    // 引数にHero型の変数を渡す
    public void heal(Hero h) {
        h.hp += 10;
        System.out.println(h.name + "のHPを10回復した！");
        System.out.println(h.hp + "になった！");
    }
}
