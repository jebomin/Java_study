package chapter_07.camera;

public class ActionCam extends Camera {
    public final String lens; //(1) lens 뒤에 '= "광각렌즈";' 붙여서 초기화 //final을 넣으면 어디에서도 lens의 값을 변경할 수 없음!
    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈"; //(2) 위에 처럼 선언만 해두고 생성자에서 초기화
    }

    public final void makeVideo() { //public과 void 사이에 final을 쓰면 자식 클래스에서 오버라이딩을 할 수 없음
        System.out.println(this.name + " : " + this.lens + "로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
    }
}
