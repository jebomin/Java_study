package chapter_07;

import java.util.Base64;

public class _01_Class {
    public static void main(String[] args) {
        //객체 지향 프로그래밍 (OOP : Object-Oriented Programming)
        //유지 보수 용이
        //높은 재사용성

        //차량용 블랙박스
        //모델명, 해상도, 가격, 색상

        //우리가 만든 첫 번째 제품
        String modelName = "까망이";
        String resolution = "FHD";
        int price = 200000;
        String color = "블랙";

        //새로운 제품을 개발
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "화이트";

        //또 다른 제품 개발?
        Blackbox bbox = new Blackbox();
        //Blackbox 클래스로부터 bbox 객체 생성
        //bbox 객체는 블랙박스 클래스의 인스턴스

        Blackbox bbox2 = new Blackbox();
    }
}
