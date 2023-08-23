package chapter_08.camera;

public abstract class Camera {
    //일반적인 클래스 메소드에서는 바디 부분을 정의
    public void takePicture() {
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo() {
        System.out.println("동영상을 녹화합니다.");
    }

    //추상 클래스에서는 정의하는 추상 메소드는 이름만 적어줌(선언만 함)
    public abstract void showMainFeature(); //Camera라는 클래스를 상속하는 자식 클래스에서 구현해야 하는 메소드

}
