package chapter_11;

public class _02_Catch {
    public static void main(String[] args) {
        //전화 상담할 때 1번은 핸드폰 문제 2번은 컴퓨터 문제 이런 느낌임
        try {
            //System.out.println(3/0);

            int[] arr = new int[3];
            arr[5] = 100;

            //Object obj = "test";
            //System.out.println((int)obj);

            //String s = null;
            //System.out.println(s.toLowerCase());
        } catch (ArithmeticException|ArrayIndexOutOfBoundsException e) {
            System.out.println("뭔가 실수 하셨네요."); //여기서 처리가 되면 넘어가지 않음(Switch랑 비슷)
        //} catch (ArrayIndexOutOfBoundsException e) {
        //    System.out.println("인덱스를 잘못 설정했어요.");
        } catch (ClassCastException e) {
            System.out.println("잘못된 형 변환입니다");
        } catch (Exception e) { //Exception : 모든 예외들의 조상 클래스, 어떤 문제가 발생했을 때 문제를 해결할 방법이 한가지가 아닐 수 있음
            System.out.println("그 외의 모든 에러는 여기서 처리가 돼요.");
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}
