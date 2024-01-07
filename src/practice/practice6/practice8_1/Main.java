package practice.practice6.practice8_1;

public class Main {
    public static void main(String[] args) {
        Cleric c = new Cleric();

        c.name = "ミナト";
        int recover_MP = c.pray(5);
        System.out.println(recover_MP);
    }

}
