package chpater_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int a = 115;
        int b = 121;
        String a_Ride = (a>=120)?"키가 "+a+"cm 이므로 탑승 가능합니다.":"키가 "+a+"cm 이므로 탑승 불가능합니다.";
        String b_Ride = (b>=120)?"키가 "+b+"cm 이므로 탑승 가능합니다.":"키가 "+b+"cm 이므로 탑승 불가능합니다.";

        System.out.println(a_Ride);
        System.out.println(b_Ride);
    }
}

