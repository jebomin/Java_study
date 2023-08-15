package chapter_06;

public class _05_OverLoading {
    public static int getPower(int number) { // "4"(정수가 아니라 문자열 형태로 받음)
        int result = number*number;
        return result;
        // 위의 두 줄을 아래로 간소화 가능
        // return  number*number;
    }

    //문자열로 받아도 거듭제곱해주는 메소드
    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number*number;
    }
    public static int getPower(int number, int exponent) {
        //포멧이 안 맞을 때 : ctrl + alt + L
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        //메소드 오버로딩
        //같은 이름의 메소드를 여러 번 선언
        //1. 전달값의 타입이 다르거나
        //2. 전달값의 갯수가 다르거나
        //+) 반환형이 다른 형태로는 메소드 오버로딩이 적용되지 않음
        System.out.println(getPower(3)); //3*3=9
        System.out.println(getPower("4")); //4*4=16
        System.out.println(getPower(3,3)); //3*3*3=27

    }
}
