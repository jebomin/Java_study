package chapter_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        //형변환 TypeCasting
        //정수형에서 실수형으로, 실수형에서 정수형으로

        //int to float, double
        int score = 93;
        System.out.println(score); //93
        System.out.println((float) score); //93.0
        System.out.println((double) score); //93.0

        //float, double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int)score_f); //93
        System.out.println((int)score_d); //98

        //정수+실수 연산
        score = 93+(int)98.8; //93+98한 결과가 score에 들어감
        System.out.println(score); //191

        score_d = 93+98.8; //여기서 93은 자동으로 double로 변환 됨 (93.0+98.8)
        System.out.println(score_d); //191.8

        //변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; //191 -> 191.0으로 자동으로 형변환
        // int -> long -> float -> double (점점 커지는 쪽으로 형변환하면 자동으로 형변환이 되므로 앞에 float 이런거 안 붙여도 됨)

        int convertedScoreInt = (int) score_d; //191.8 -> 191
        // double -> float -> long -> int (점점 작아지는 쪽으로 형변환 하면 수동으로 형변환)

        //숫자를 문자열로
        String s1 = String.valueOf(93); //String이라는 클래스가 제공하는 ValueOf라는 기능을 사용해서 93이라는 정수를 문자열로 바꿈
        s1 = Integer.toString(93);
        System.out.println(s1); //93

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2); //98.8

        //문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);

        double d = Double.parseDouble("98.8");
        System.out.println(d);

        //int error = Integer.parseInt("자바"); (따옴표 안에 있어햐 하는 데이터가 올바라야 한다는 에시)
    }
}
