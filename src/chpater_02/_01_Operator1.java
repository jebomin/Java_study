package chpater_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        //산술 연산자

        //일반 연산
        System.out.println(4+2); //6
        System.out.println(4-2); //2
        System.out.println(4*2); //8
        System.out.println(4/2); //2
        System.out.println(5/2); //2
        System.out.println(2/4); //0
        System.out.println(4%2); //0(% : 나머지)
        System.out.println(5%2); //1

        //우선 순위 연산
        System.out.println(2+2*2); //6
        System.out.println((2+2)*2); //8
        System.out.println(2+(2*2)); //6

        //변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a+b;
        System.out.println(c); //30

        c = a-b;
        System.out.println(c); //10

        c = a*b;
        System.out.println(c); //200

        c=a/b;
        System.out.println(c); //2

        c=a%b;
        System.out.println(c); //0

        //증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); //10
        System.out.println(++val); //더하는 연산을 먼저 -> 11
        System.out.println(val); //11

        val = 10;
        System.out.println(val); //10
        System.out.println(val++); //10
        System.out.println(val); //11

        val = 10;
        System.out.println(val); //10
        System.out.println(--val); //9
        System.out.println(val); //9

        val =10;
        System.out.println(val); //10
        System.out.println(val--); //10
        System.out.println(val); //9

        //은행 대기번호 표
        //커서 앞에 두고 ctrl+d 누르면 똑같은 문장 그대로 복사해줌
        int waiting = 0;
        System.out.println("대기인원 : " + waiting++); //대기인원 : 0
        System.out.println("대기인원 : " + waiting++); //대기인원 : 1
        System.out.println("대기인원 : " + waiting++); //대기인원 : 2
        System.out.println("총 대기인원 : " + waiting); //총 대기인원 : 3
    }
}
