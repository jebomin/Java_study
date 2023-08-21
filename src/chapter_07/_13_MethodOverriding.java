package chapter_07;

import chapter_07.camera.Camera;
import chapter_07.camera.FactoryCam;
import chapter_07.camera.SpeedCam;

public class _13_MethodOverriding {
    public static void main(String[] args) {
        //메소드 오버라이딩 : 자식 클래스에서 부모 클래스의 메소드를 덮어쓰기(재정의)
        //메소드 오버로딩 : 같은 클래스 내에서 같은 이름의 메소드를 파라미터의 개수와 타입을 다르게 함으로써 여러개를 정리하는 것

        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();
    }
}
