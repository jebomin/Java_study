package chapter_09.coffee;

import chapter_09.user.User;

public class CoffeeByUser <T extends User> { //어떤 타입(T)을 써도 상관은 없자먼 User클래스를 상속하는거로 써야함(즉 VIPUser만 쓸 수 있게 됨)
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " +user.name);
        user.addPoint();
    }
}
