package chapter_09;

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
    }
}
