package chapter_08;

import chapter_08.camera.FactoryCam;
import chapter_08.detector.AdvanvedFireDetector;
import chapter_08.detector.Detectable;
import chapter_08.detector.FireDetector;
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

        System.out.println("------------------------------------");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancdedFireDetector = new AdvanvedFireDetector();
        advancdedFireDetector.detect();

        System.out.println("------------------------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancdedFireDetector);
        factoryCam.setReporter(videoReporter);

        factoryCam.detect();
        factoryCam.report();
    }
}
