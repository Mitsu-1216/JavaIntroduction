package pa;

import java.util.*;
public class D_4 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String wantFood = sc.nextLine();
        int count = Integer.parseInt(sc.nextLine());
        String menu = sc.nextLine();
        String[] menus = menu.split(" ");
        int ngcnt= 1;
        
        for(int i = 0; i < menus.length; i++){
            if(wantFood.equals(menus[i])){
                System.out.println("Yes");
                break;
            } else {
                ngcnt++;
                if(ngcnt == count){
                    System.out.println("No");
                }
            }
        }
    }
}