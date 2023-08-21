package chapter_07.camera;

//상속은 IS-A 관계
//FactoryCam is a Camera.(IS-A)
public class FactoryCam extends Camera { //자식 클래스

    public FactoryCam() {
        this.name = "공장 카메라";
    }

    public void detectFire() {
        System.out.println("화재를 감지합니다.");
    }

    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 화재 감지");
    }
}
