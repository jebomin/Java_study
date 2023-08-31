package chapter_12;

import chapter_12.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        //하나의 프로세스(process)
        //쓰레드(thread) - 사람 한명 당 하나의 쓰레드

        //방 구조
        //1 3 5 7  9
        //2 4 6 8 10

        //cleanBySelf();

        CleanThread cleanThread = new CleanThread();
        //cleanThread.run(); //직원이 청소
        cleanThread.start(); //위와 달리 이렇게 해야 동시에 처리 가능

        cleanByBoss(); //사장님이 청소
    }
    public static void cleanBySelf() {
        System.out.println("-- 혼자서 청소 시작 --");
        for (int i = 1; i <= 10; i++) {
            System.out.println("(혼자) "+i+"번방 청소 중");
        }
        System.out.println("-- 혼자 청소 끝 --");
    }

    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("(사장) "+i+"번방 청소 중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
