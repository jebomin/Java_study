package chapter_09.coffee;

public class CoffeeByName {
    public Object name; //integer, double, string, BlackBox(Object) ..

    public CoffeeByName(Object name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 주문 완료 : " + name);
    }
}
