package chapter_10;

public class _03_Lambda {
    public static void main(String[] args) {
        //람다식
        // 1.접근 제어자 필요 없음[public 필요 없음]
        // 2. 이름도 필요 없음[print 삭제 가능]
        // 3. 람다에서 리턴하는 값이 있으면 자동으로 return 타입 정해줌[void 삭제 가능]
        // 4-1. 한줄로 된 코드면 중괄호 삭제 가능, 세미콜론 생략 가능
        // 4-2. 한줄 코드에 return이 포함되면 중괄호 생략 불가
        // 4-3. 그런데 람다식에서는 return 값 생략 가능(이렇게 되면 중괄호랑 세미콜론 생략할 수 있음)
        // 5. 전달되는 값이 string 형태인걸 컴파일러가 알 수 있음[String 생략 가능] > int여도 가능, 그냥 반환형 알아서 처리해줌
        // 6. 전달 값이 하나면 소괄호 생략 가능
        //(전달값1, 전달값2, ...) -> {코드}
    }

//    public void print() {
//        String s = "test";
//        System.out.println(s);
//    }

//    () -> {
//        String s = "test";
//        System.out.println(s);
//    }

//    public void print(String s) {
//        System.out.println(s);
//    }

//    s -> System.out.println(s);

//    public int add(int x, int y) {
//        return x+y;
//    }

//    (x, y) -> x+y
}
