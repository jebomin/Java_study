package chapter_12;

import chapter_12.clean.CleanRunnable;

public class _02_Runnable {
    //thread : 클래스 상속, runnable : 인터페이스 구현
    //상속은 단일 상속만 가능(하나의 부모 클래스만 갖기 가능)
    //인터페이스는 여러개를 한꺼번에 구현할 수 있고 extends로 상속도 됨(다중 상속 가능)
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        cleanByBoss();
    }
    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("(사장) "+i+"번방 청소 중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
