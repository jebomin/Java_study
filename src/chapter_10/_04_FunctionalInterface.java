package chapter_10;

import chapter_10.converter.Convertable;
import chapter_10.converter.KRWConverter;

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
    }

    public static void convertUSD(Convertable converter, int USD) {
        converter.convert(USD);
    }
}
