package chapter_09.coffee;

public class CoffeeByNickname {
    public String nickname;

    public CoffeeByNickname(String nickname) {
        this.nickname = nickname;
    }

    public void ready() {
        System.out.println("커피 주문 완료 : " + nickname);
    }
}
