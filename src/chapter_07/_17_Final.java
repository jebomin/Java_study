package chapter_07;

import chapter_07.camera.ActionCam;
import chapter_07.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        //Final(상수 공부 했을 때 배움)
        //Final로 선언하면 선언과 동시에 초기화하고 그 이후에 값을 사용할 수 있으나 변경할 수는 없음

        //Final 위치
        //public (final) class ..
        //public (final) void ..
        //public > abstract > static > final > ...

        ActionCam actionCam = new ActionCam();
        //actionCam.lens = "표준렌즈";
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println("-------------------------");

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.recordVideo();
        slowActionCam.makeVideo();
    }
}
