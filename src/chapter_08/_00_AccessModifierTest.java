package chapter_08;

import chapter_07.*;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; //public
        //b1.resolution = "FHD"; //default
        //b1.price - 200000; //private
        //b1.color = "블랙"; //protected

        Blackbox b2;
    }
}
