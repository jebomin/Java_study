package chapter_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 5; //주차 시간을 5시간으로 임의 지정
        boolean small = false; //경차 여부
        boolean unHealthy = false; //장애차량 여부
        int fee = hour*4000; //주차 요금

        if(fee>30000){
            fee = 30000;
        }

        if(small==true||unHealthy==true){
            //fee /= 2;
            fee = fee/2;
        }

        System.out.println("주차 요금은 "+fee+" 원 입니다.");
    }
}
