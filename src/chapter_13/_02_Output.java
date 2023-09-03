package chapter_13;

public class _02_Output {
    public static void main(String[] args) {
        //System.out.format();
        //System.out.printf();

        System.out.println("--------정수--------");
        System.out.printf("%d%n" ,1); // 1
        System.out.printf("%d %d %d%n" ,1,2,3); // 1 2 3
        System.out.printf("%d%n",1234); //1234
        System.out.printf("%6d%n", 1234); // __1234 (6자리의 공간을 확보 후 1234를 출력)
        System.out.printf("%06d%n", 1234); //001234 (6자리의 공건울 확보 후 1234 출력하는데 빈 공간을 0으로 채움)
        System.out.printf("%6d%n", -1234); //_-1234
        System.out.printf("%+6d%n", 1234); //_+1234 (항상 기호 표시)
        System.out.printf("%,15d%n",1000000000); // __1,000,000,000 (세자리마다 콤마로 구분)
        System.out.printf("%-6d%n", 1234); //1234__ (6자리 공간을 확보하고 나서 왼쪽 정렬 1234 출력)
    }
}
