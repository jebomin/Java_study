package chapter_07.camera;

public class FactoryCam extends Camera { //자식 클래스

    public FactoryCam() {
        this.name = "공장 카메라";
    }

    public void detectFire() {
        System.out.println("화재를 감지합니다.");
    }
}
