package pa;

import java.util.*;

public class D_5 {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int total = Integer.parseInt(sc.nextLine());
        
        List<Integer> scores = new ArrayList<Integer>();
        
        while(sc.hasNext()) {
            int score = Integer.parseInt(sc.next());
            scores.add(score);
        }
        
        List copyScores = new ArrayList(scores);

        Collections.sort(scores, Collections.reverseOrder());
        
         System.out.println(scores);

        Map<Integer, Integer> map = new HashMap<>();
        
        int j = 0;

        
        // Mapにキーと値を格納
        for (int i = 0; i < scores.size(); i++) {
            System.out.println("i:"+i);
            
            if(i == 0) {
                map.put(scores.get(i), 1);
            } else {
                if (scores.get(i) == scores.get(i-1)) {
                    map.put(scores.get(i),map.get(scores.get(i-1)));
                    j++;
                } else {
                    map.put(scores.get(i),map.get(scores.get(i-1))+1+j);
                    j = 0;
                }
            }
        }
        
        // // Mapからデータを取得する
        System.out.println(map.get(copyScores.get(0)));
        System.out.println(map.get(copyScores.get(1)));
        System.out.println(map.get(copyScores.get(2)));
        System.out.println(map.get(copyScores.get(3)));
        
    }
}
