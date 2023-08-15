package chapter_06;

public class _04_ParameterAndReturn {
    public static int getPower(int number) {
        int result = number*number;
        return result;
        // 위의 두 줄을 아래로 간소화 가능
        // return  number*number;
    }

    public static int getPowerByExp(int number, int exponent) {
        //포멧이 안 맞을 때 : ctrl + alt + L
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }


    public static void main(String[] args) {
        //전달값과 반환값이 함께 있는 메소드
        int retVal = getPower(2); //2*2=4
        System.out.println(retVal);

        retVal = getPower(3); //3*3=9
        System.out.println(retVal);

        retVal = getPowerByExp(3,3); //3*3*3=27
        System.out.println(retVal);

        System.out.println(getPowerByExp(2, 4)); //2*2*2*2=16
    }
}
