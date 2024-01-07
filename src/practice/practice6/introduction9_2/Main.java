package practice.practice6.introduction9_2;

public interface Main {
    public static void main(String[] args) {
        // インスタンス自体は１つ(new1回)
        Hero h1 = new Hero();
        h1.hp = 100;
        // インスタンスそのものがコピーされるのではなく、
        // 番地情報がコピーされる
        Hero h2 = h1;
        h2.hp = 200;
        // h1,h2ともに同じインスタンスを指している
        System.out.println(h1.hp);
    }
}
