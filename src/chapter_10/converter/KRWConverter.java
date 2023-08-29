package chapter_10.converter;

public class KRWConverter implements Convertable{
    @Override
    public void convert(int USD) {
        //1 달러 = 1400 원
        System.out.println(USD + " 달러 = "+(USD*1400)+" 원");
    }
}
