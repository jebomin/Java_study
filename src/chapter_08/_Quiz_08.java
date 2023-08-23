package chapter_08;

import chapter_08.camera.SpeedCam;

import chapter_08.detector.AccidentDetector;
import chapter_08.detector.Detectable;
import chapter_08.reporter.VideoReporter;

public class _Quiz_08 {
    public static void main(String[] args) {
        SpeedCam speedCam = new SpeedCam();
        speedCam.setDetector(new AccidentDetector());
        speedCam.setReporter(new VideoReporter());
        speedCam.detect();
        speedCam.report();
    }
}
