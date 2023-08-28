package chapter_09;

import java.util.*;

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

        //hashset iterator 사용
        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");
        Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }
        System.out.println("-------------------------------");

        //hashmap iterator 사용
        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 10);
        map.put("박명수", 5);

        //map.iterator() -> map에는 key와 value 두 개가 있어 어떤게 적용될지 몰라서 이 기능은 제공되지 않음
        Iterator<String> itMapKey = map.keySet().iterator();
        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }
        System.out.println("-------------------------------");

        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }
        System.out.println("-------------------------------");

        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while (itMap.hasNext()) {
            System.out.println(itMap.next());
        }
        System.out.println("-------------------------------");
    }
}
