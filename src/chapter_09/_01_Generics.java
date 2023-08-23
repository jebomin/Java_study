package chapter_09;

public class _01_Generics {
    public static void main(String[] args) {
        //제네릭스 : 다양한 타입의 객체를 지원하는 클래스, 인터페이스, 메소드를 정의하는 방법
        //같은 동작을 하는 클래스, 인터페이스, 메소드를 한번만 정의해서 지원할 수 있도록 하는 것

        //Wrapper 클래스
        //int -> Integer.parseInt();
        //double -> Double.toString();
        //String.valueOf(); // -> 참고로 얘는 wrapper 클래스 아님
        ///////

        Integer[] iArray = {1,2,3,4,5};
        Double[] dArray = {1.0,2.0,3.0,4.0,5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("----------------------------");

        //제네릭스에서 지원하는 것은 객체
        //기본 자료형(int, double, 등)은 제네릭스 타입으로 바로 쓸 수 없음
        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    //서로 다른 타입의 데이터가 들어와도 출력되어야 함
    //T : Type, K : Key, V : Value, E : Element
    private static <T> void printAnyArray(T[] array) {
        for (T t:array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for (String s:sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for (double d:dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    public static void printIntArray(Integer[] iArray) {
        for (int i:iArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
