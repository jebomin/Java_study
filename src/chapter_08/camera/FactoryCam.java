package chapter_08.camera;

public class FactoryCam extends Camera{
    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    public void detect() {
        System.out.println("화재를 감지합니다.");
    }

    public void report() {
        System.out.println("화재 신고를 진행합니다.");
    }
}
