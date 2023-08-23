package chapter_09;

import chapter_09.coffee.Coffee;
import chapter_09.coffee.CoffeeByName;
import chapter_09.coffee.CoffeeByNickname;
import chapter_09.coffee.CoffeeByNumber;

public class _02_GenericsClass {
    public static void main(String[] args) {
        //제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(31);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("한선우♥");
        c2.ready();

        System.out.println("-------------------------");

        CoffeeByName c3 = new CoffeeByName(32);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("제보민");
        c4.ready();

        System.out.println("-------------------------");

        int c3Name = (int) c3.name;
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름 : " + c4Name);

        System.out.println("-------------------------");

        //c4Name = (String) c3.name;

        Coffee<Integer> c5 = new Coffee<>(33);
        c5.ready();
        //위와 달리 형변환 하지 않아도 됨
        int c5Name = c5.name;
        System.out.println("주문 고객 번호 : " + c5Name);

        Coffee<String> c6 = new Coffee<>("페티");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);

        //장점 : 코드 중복 없앰, 값을 가지고 올 때 형변환 안해도 됨 -> 개발상의 실수 없(
    }
}
