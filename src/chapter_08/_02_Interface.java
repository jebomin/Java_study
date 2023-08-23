package chapter_08;

import chapter_08.reporter.*;

public class _02_Interface {
    public static void main(String[] args) {
        //인터페이스 -> 그냥 뼈대
        //추상 클래스 -> 미완성된 클래스
        //단일 상속(extends)
        Reportable normalReporter = new NormalReporter();
        normalReporter.report();

        Reportable videoReporter = new VideoReporter();
        videoReporter.report();
    }
}
