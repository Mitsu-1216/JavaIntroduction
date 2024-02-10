package pa;

public class D_3 {
    public static void main(String[] args) {
        String word = "samui";
        int a = 5;

        // StringBuilder
        StringBuilder words = new StringBuilder();
        words.append(word);
        words.delete(a-1,a);
        System.out.println(words.toString());
    }
}   

