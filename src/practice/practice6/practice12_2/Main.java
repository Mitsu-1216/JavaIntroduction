package practice.practice6.practice12_2;

public interface Main {
    public static void main(String[] args) {
        Wizard w = new Wizard();
        Character c = w;
        Matango m = new Matango();
        w.name = "アサカ";
        c.attack(m);
        // cではエラーが起きる↓
        // c.fireball(m);
        w.fireball(m);
    }
}
