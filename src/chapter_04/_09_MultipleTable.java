package chapter_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        //구구단
        for (int i = 2; i <= 9 ; i++) {
            for (int j = 1; j <=9 ; j++) {
                System.out.println(i+"*"+j+"="+(i*j));
            }
            System.out.println(); //단별로 구분하기 위해 줄바꿈
        }
    }
}
