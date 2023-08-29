package chapter_10;

import chapter_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
        //converter.convert(1);

        //convertUSD((USD) -> System.out.println(USD + " 달러 = "+(USD*1400)+" 원"), 2);

        //이 아래 한줄은 함수형 인터페이스(메소드 같은 것)
        //*메소드와 함수 차이
        //클래스 내에서 기능을 수행 -> 메소드
        //클래스 밖에서 기능을 수행 -> 함수
        //다만 자바는 다른 언어와 다르게 모두 클래스 내에서 정의하기 때문에 그냥 메소드라고 부르는 것 뿐
        Convertable convertable = (USD) -> System.out.println(USD + " 달러 = "+(USD*1400)+" 원");
        convertUSD(convertable, 1);

        //전달 값이 하나도 없다면? 위에는 'USD' 전달 값이 있음
        ConvertibleWithNoParams c1 = () -> System.out.println("1 달러 = 1400 원");
        c1.convert();

        //두 줄 이상의 코드가 있다면?
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + " 달러 = "+(USD*KRW)+" 원");
        };
        c1.convert();

        //전달 값이 두개인 경우?
        ConvertibleWithTwoParams c2 = (d, w) -> System.out.println(d + " 달러 = "+(d*w)+" 원");
        c2.convert(10, 1400);

        //반환 값이 있는 경우?
        ConvertibleWithReturn c3 = (d,w) -> {return d*w;};
        int result = c3.convert(20, 1400);
        System.out.println("20 달러 = " + result + " 원");
    }

    public static void convertUSD(Convertable converter, int USD) {
        converter.convert(USD);
    }
}
