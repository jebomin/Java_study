package chapter_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        //변수 이름 짓는 법
        //1. 저장할 값에 어울리는 이름
        //2. 밑줄(_), 문자(abc), 숫자(123) 사용 가능(공백 사용 불가)
        //3. 밑줄 또는 문자로 시작 가능
        //4. 한 단어 또는 2개 이상 단어의 연속
        //5. 소문자로 시작, 각 단어의 시작 글자는 대문자(첫 단어는 제외)
        //6. 예약어 사용 불가(public, static, void, int, double, float, ...)

        //입국 신고서(여행)
        String nationality = "대한민국"; //국적
        String firstName = "보민"; //이름
        String lastName = "제"; //성
        String dateOfBirth = "2001-05-15"; //생년월일
        String residentialAddress = "세인트호텔"; //체류지
        String purposeOfVisit = "관광"; //입국 목적
        String _flightNo = "KE657"; //항공편명(밑줄로 시작)
        String fight_no_2 = "KE658"; //항공편명(밑줄 중간에 넣음)

        int accompany = 2; //동반가족수
        int lengthOfStay = 5; //체류기간
        String item = "시계";
        String item2 = "가방";

        //프로그램의 흐름을 위해 사용되는 경우 등(크게 이름이 중요하지 않음)
        int i = 0;
        String s = "";
        String str = "";

        //절대 변하지 않는 상수는 대문자로(final 붙이면 상수고 변수처럼 밑에서 변경이 되지 않음)
        final String CODE = "KR";
    }
}
