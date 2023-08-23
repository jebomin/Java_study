package chapter_08;

import chapter_08.camera.Camera;
import chapter_08.camera.FactoryCam;
import chapter_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        //데이터 추상화(Data Abstraction)
        //abstract
        //추상 클래스(아직 완성되지 않은 클래스) -> 완성되지 않아서 객체로 만들 수 없음, 클래스를 상속해서 구체적으로 선언을 해야 객체로 만들 수 있음
        //추상 메소드(추상 클래스 또는 추상 인터페이스에서만 사용 가능한, 껍데기만 있는 메소드)
        //추상 클래스에서는 추상 메소드를 가질 수도 있고 가지지 않을 수도 있음
        //갖지 않는더라도 추상 클래스는 객체를 만들 수 없고 상속한 자식 클래스에서만 만들 수 있음
        //추상 메소드가 추상 클래스에 있으면 자식 클래스에서는 반드시 추상 메소드를 반드시 구현해야함!

        //Camera camera = new Camera(); -> Camera는 추상 클래스이기 때문에 객체를 만들 수 없음

        //추상 클래스를 상속한 자식 클래스 FactoryCam에서는 객체를 만들 수 있음
        FactoryCam factoryCam = new FactoryCam();
        //Camera factoryCam = new FactoryCam(); -> 이렇게도 가능(다형성때문에)
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        //Camera speedCam = new SpeedCam(); -> 이렇게도 가능(다형성때문에)
        speedCam.showMainFeature();
    }
}
