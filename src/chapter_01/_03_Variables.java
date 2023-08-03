package chapter_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "보민";
        int hour = 15;
        System.out.println(name + "님, 배송이 시작됩니다. "+hour+"시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");
        double score = 90.5;
        char grade = 'A'; //여러 글자인 String은 큰 따옴표 한 글자인 char는 작은 따옴표
        name = "선우";
        System.out.println(name+"님의 평균 점수는 "+score+"점입니다.");
        System.out.println(name+"님의 학점은 "+grade+"입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을가요? "+pass);

        //double 보다는 크기도 작고 정밀도가 떨어지지만 실수형을 나타내는 float(소수점 나타내려면 f나 F를 뒤에 붙여야함)
        //추가로 float은 아래와 같은 수를 넣으면 6까지 밖에 출력이 안됨
        double d = 3.14123456789;
        float f= 3.14123456789f;
        System.out.println(d);
        System.out.println(f);

        //int처럼 정수형이지만 엄청나게 큰 수를 넣을때 사용하는 long으로 선언하고 뒤에 l 또는 L 작성
        //int는 -21억~21억
        long i = 1000000000000l;
        i = 1_000_000_000_000l; //이렇게 하면 3자리씩 구분 가능 출력은 그냥 1000000000000로 나옴
        System.out.println(i);
    }
}
