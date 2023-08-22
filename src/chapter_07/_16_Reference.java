package chapter_07;

import chapter_07.camera.Camera;

import java.util.Calendar;

public class _16_Reference {
    public static void main(String[] args) {
        //참조
        //기본 자료형(Primitive Data Types) : int, float, double, long, boolean, ...
        int[] i = new int[3];
        System.out.println(i[0]); //0

        double[] d = new double[3];
        System.out.println(d[0]); //0.0

        //참조 자료형(Non-Primitive, Reference Data Types) : String, Camera, FactoryCam, SpeedCam
        String[] s = new String[3];
        System.out.println(s[0]); // null

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null); //true -> null이 들어갔다는 것을 의미
        //기본 자료형과 참조 자료형의 차이
        //(값을 지정하지 않았을 때) -> 기본형 : 0, 참조형 : null
        //(메소드의 유무) -> 기본형 : 메소드 X, 참조형 : 메소드 O
        //(소문자로 시작하는가) -> 기본형 : 소문자, 참조형 : 대문자

        System.out.println("------------------------------");
        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a);
        System.out.println(b);
        b = 30;
        System.out.println(a);
        System.out.println(b);

        System.out.println("------------------------------");
        //a와 b는 별도로 작동하고 c1과 c2는 같이 작동 why?
        //c1과 c2는 어떤 메모리 공간에서 참조
        //풍선으로 비유
        Camera c1 = new Camera(); //c1은 해당 풍선(new Camera()) 잡고 있고
        Camera c2 = new Camera(); //c2도 해당 풍선(new Camera()) 잡고 있음
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2=c1; //c2가 c1이 잡고 있는 풍선도 같이 잡음
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2.name = "고장난 카메라"; //현재 c2와 c1 풍선 둘다 잡고 있어서(같은 공간 참조) 이름이 '고장난 카메라'라고 둘 다 바뀌는 거임
        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println("------------------------------");
        changeName(c2);
        System.out.println(c1.name);
        System.out.println(c2.name);
        //기본 자료형은 복사고 참조 자료형은 가르키는 것(참조)

        //만약 c2와 c1을 한 손에 잡고 싶지 않다면(관계를 끊고 싶다면)? -> 아래와 같이
        //c2 = null;
        //System.out.println(c2.name);
    }

    public static void changeName(Camera camera) { //여기서 카메라도 참조형이라서 c1을 가르키고 있음
        camera.name = "잘못된 카메라"; //이러면 c1 이름이 바뀌는 거(즉 c1, c2 둘다 바뀜)
    }
}
