package practice.practice6.introduction10_8;

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
