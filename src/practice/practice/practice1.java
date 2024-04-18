package practice.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class practice1 {

  public static void main(String[] args) {
    List<String> sportslist = new ArrayList<>();
    sportslist.add("soccer");
    sportslist.add("tennis");
    sportslist.add("basketball");

    // イテレータを取得して、メソッドを呼び出す
    printIterable(sportslist.iterator());

    // セットを作成する
    Set<String> set = new HashSet<>();
    set.add("ブルーロック");
    set.add("テニプリ");
    set.add("スラダン");

    // イテレータを取得し、メソッドを呼び出す
    printIterable(set.iterator());
  }

  private static void printIterable(Iterator<String> iterator) {
    while (iterator.hasNext()) {
      String s = iterator.next();
      System.out.println(s);
    }
  }
}