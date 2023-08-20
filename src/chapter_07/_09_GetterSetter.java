package chapter_07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        Blackbox b1 = new Blackbox();
        b1.modelName = "까망이";
        //b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";

        //할인 행사
        b1.price = -5000;
        System.out.println("가격 : " + b1.price + "원");

        //고객 문의
        System.out.println("해상도 : " + b1.resolution);

        System.out.println("----------------------");

        Blackbox b2 = new Blackbox();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격 : " + b2.getPrice()+"원");
        System.out.println("해상도 : " +b2.getResolution());
    }
}
