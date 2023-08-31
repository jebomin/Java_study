package chapter_10;

import java.util.ArrayList;

public class _Quiz_10 {
    public static void main(String[] args) {
        //객체 응용 문제
        ArrayList<Customer> list = new ArrayList<>();
        list.add(new Customer("챈들러", 50));
        list.add(new Customer("레이첼", 42));
        list.add(new Customer("모니카", 21));
        list.add(new Customer("벤자민", 18));
        list.add(new Customer("제임스", 5));

        System.out.println("미술관 입장료");
        System.out.println("---------------------");
        list.stream()
                .map(x->x.age>=20?x.name+" 5000원":x.name+ " 무료")
                .forEach(System.out::println);
    }
}

class Customer {
    public String name;
    public int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
