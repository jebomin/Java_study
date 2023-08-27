package chapter_09;

import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        //링크드 리스트
        LinkedList<String> list = new LinkedList<>();

        //데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        //데이터 조회(인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("--------------------------");

        //추가
        list.addFirst("서장훈"); //처음 위치에다가 추가
        for(String s:list) {
            System.out.println(s);
        }
        System.out.println("--------------------------");

        list.addLast("김희철"); //마지막 위치에다가 추가
        for(String s:list) {
            System.out.println(s);
        }
        System.out.println("--------------------------");

        System.out.println("학생 추가 전 : "+list.get(1));
        list.add(1, "김영철"); //1번 index에 내용 추가
        System.out.println("학생 추가 후 : "+list.get(1));
        System.out.println("학생 추가 후 : "+list.get(2));

        System.out.println("--------------------------");
    }
}
