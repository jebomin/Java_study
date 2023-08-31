package chapter_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        //예외 처리
        //오류
        // 1. 컴파일 오류(프로그램에 문제가 있어서 실행 자체가 안됨)
        // 2. 런타임 오류(컴파일은 되지만 실행하는 과정이 오래 걸림
        // 2-1. error(에러) - 수습 불가(예 : 메모리가 부족)
        // 2-2. exception(예외) - 수습 가능

        try {
            //System.out.println(3/0);

            //int[] arr = new int[3];
            //arr[5] = 100;

            Object obj = "test";
            System.out.println((int)obj);
        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요 => "+e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}
