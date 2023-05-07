package practice6.introduction10_9;

public interface Main {
    public static void main(String[] args) {
        Matango m = new Matango();

        Hero h = new Hero();
        h.run();
        SuperHero sh = new SuperHero();
        sh.run();
        sh.fly(m);
        sh.attack(m);
    }
}
