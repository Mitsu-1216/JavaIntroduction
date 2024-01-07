package practice.practice6.introduction9_5;

public interface Main {
    public static void main(String[] args) {

        Hero h1 = new Hero();
        h1.name = "デク";
        h1.hp = 100;

        Hero h2 = new Hero();
        h2.name = "大爆殺王";
        h2.hp = 100;

        Wizard w = new Wizard();
        w.name = "ショート";
        w.hp = 50;

        w.heal(h1);
        w.heal(h2);
        w.heal(h2);

    }
}
