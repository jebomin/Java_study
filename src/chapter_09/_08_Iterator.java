package chapter_09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _08_Iterator {
    public static void main(String[] args) {
        //이터레이터 : list와 set에 있는 불필요한 데이터를 삭제(커서 이동하는 개념)
        List<String> list = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        list.add("유재석");
        list.add("(알수 없음)");
        list.add("김종국");
        list.add("(알수 없음)");
        list.add("강호동");
        list.add("(알수 없음)");
        list.add("박명수");
        list.add("(알수 없음)");
        list.add("조세호");

        for (String s:list) {
            System.out.println(s);
        }
        System.out.println("-------------------------------");

        //반환형을 가지는 메소드에 마우스 올리고 ctrl+alt+v 하면 자동 완성됨
        Iterator<String> it = list.iterator();
        System.out.println(it.next()); //커서 이동
        System.out.println(it.next()); //커서 이동
        System.out.println(it.next()); //커서 이동
        System.out.println(it.next()); //커서 이동

        System.out.println("-------------------------------");
        it = list.iterator(); //커서 처음 위치로 이동
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-------------------------------");

        it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if(s.contains("(알수 없음)")) {
                it.remove(); //삭제
            }
        }

        //위에서 삭제 끝나고 삭제 된 데이터를 순회하면서 보여줌
        it = list.iterator(); //커서 처음 위치로 이동
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-------------------------------");
    }
}
