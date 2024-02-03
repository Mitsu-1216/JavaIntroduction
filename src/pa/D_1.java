package pa;

import java.util.*;

public class D_1 {
    public static void main(String[] args) {
        String line = "Hxexlxlxox!x!x";
        String word = "";
        for(int i = 0; i < line.length()/2; i++){
            word += String.valueOf(line.charAt(i*2));
            }
        System.out.println(word);
    }
}

