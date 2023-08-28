package chapter_09;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        //맵(key, value)
        HashMap<String, Integer> map = new HashMap<>();

        //데이터 추가
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);

        System.out.println("총 고객 수 : " +map.size());
        System.out.println("--------------------------");

        //조회
        System.out.println("유재석님의 포인트 : "+map.get("유재석"));
        System.out.println("박명수님의 포인트 : "+map.get("박명수"));
        System.out.println("--------------------------");

        //확인
        if(map.containsKey("서장훈")) {
            int point = map.get("서장훈");
            map.put("서장훈", ++point);
            System.out.println("서장훈님의 누적 포인트 : " +map.get("서장훈"));
        } else {
            map.put("서장훈", 1);
            System.out.println("서장훈님 신규 등록 (포인트 1)");
        }
        System.out.println("--------------------------");

        //삭제
        map.remove("유재석");
        System.out.println(map.get("유재석"));
        System.out.println("--------------------------");

        //전체 삭제
        map.clear();
        if(map.isEmpty()) {
            System.out.println("남은 고객 수 : "+map.size());
            System.out.println("가게 접자");
        }
        System.out.println("--------------------------");

        //다시 고객들이 막 찾아옴
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);

        //key 확인
        //HashMap도 순서 보장 안됨
        for(String key:map.keySet()) {
            System.out.println(key);
        }
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        System.out.println("--------------------------");

        //value 확인
        for (int value:map.values()) {
            System.out.println(value);
        }
        System.out.println("--------------------------");

        //key, value 함께 확인
        for(String key:map.keySet()) {
            System.out.println("고객 이름 : "+key+"\t포인트 : "+map.get(key));
        }
        System.out.println("--------------------------");

        //맵 : 중복 X, 순서 보장 X
        //만약 순서를 보장하고 싶으면 LinkedHashpMap 사용
        map.put("김종국", 10);
        map.put("김종국", 30);
        map.put("김종국", 50); //최종적으로 업데이트 한 값으로 출력됨

        for(String key:map.keySet()) {
            System.out.println("고객 이름 : "+key+"\t포인트 : "+map.get(key));
        }
        System.out.println("--------------------------");
    }
}
