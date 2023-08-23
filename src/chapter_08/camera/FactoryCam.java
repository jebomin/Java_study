package chapter_08.camera;

import chapter_08.detector.Detectable;
import chapter_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {
    private Detectable detector;
    private Reportable reporter;

    public void setDetector(Detectable detector) {
        detector.detect();
    }

    public void setReporter(Reportable reporter) {
        reporter.report();
    }

    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    @Override
    public void detect() {

    }

    @Override
    public void report() {

    }
}
