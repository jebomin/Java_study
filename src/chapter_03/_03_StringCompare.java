package chapter_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); //문자열 내용이 같으면 true, 다르면 false
        System.out.println(s2.equalsIgnoreCase("python")); //대소문자 구분 없이 문자열 내용만 같으면 true

        //문자열 비교 심화
        //벽에 붙은 메모지의 비밀번호 정보
        //메모지는 하나만 붙어있는 거고 참조하는 것임
        //즉 s1과 s2는 똑같은 곳을 참조중
        s1 = "1234";
        s2 = "1234";
        System.out.println(s1.equals(s2)); //true (내용 비교)
        System.out.println(s1 == s2); //true (참조 비교)

        //아래의 케이스는 서로다른 메모지인 것임
        //즉 각각의 손님들에게 화장실 비밀번호 메모지를 다 따로 부여(참조하는 위치가 다름)
        s1 = new String("1234");
        s2 = new String("1234");

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1 == s2); //false

        //자바에서 문자열의 내용을 비교할 때 equals를 사용한다는 사실 기억!
    }
}
