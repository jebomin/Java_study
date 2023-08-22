package chapter_07;

import chapter_07.camera.FactoryCam;
import chapter_07.camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        //Super : 부모 클래스에서 어떤거를 자식 클래스에서 사용
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println("-------------------");
        speedCam.takePicture();
    }
}
