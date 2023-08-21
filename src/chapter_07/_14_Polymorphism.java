package chapter_07;

import chapter_07.camera.Camera;
import chapter_07.camera.FactoryCam;
import chapter_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        //다형성

        //class Person : 사람
        //class Student extends Person : 학생(학생은 사람이다)
        //class Teacher extends Person : 선생님(선생님은 사람이다)

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("------------------------------------");
        System.out.println("------------------------------------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam: cameras) {
            cam.showMainFeature();
        }

        System.out.println("------------------------------------");

        //factoryCam.detectedFire();
        //speedCam.checkSpeed();
        //speedCam.recognizeLicensePlate();

        if (camera instanceof Camera) {
            System.out.println("카메라입니다.");
        }

        if (factoryCam instanceof FactoryCam) {
            ((FactoryCam)factoryCam).detectFire(); //형변환 해야함
        }

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam)speedCam).checkSpeed();
            ((SpeedCam)speedCam).recognizeLicensePlate();
        }

        //자바는 기본적으로 Object라는 클래스를 상속
        Object[] objs = new Object[3];
        objs[0] = new Camera();
        objs[1] = new SpeedCam();
        objs[2] = new SpeedCam();
    }
}
