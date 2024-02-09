package pa;

public class D_3 {
    public static void main(String[] args) {
        String word = "samui";
        int count = 5;

        StringBuilder sb = new StringBuilder();
        sb.append(word);
        sb.delete(count-1,count);
        System.out.println(sb.toString());
    }
}   

