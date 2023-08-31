package chapter_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        //스트림(필터링 기능)
        //스트림 생성

        //Arrays.stream()
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
        Stream<String> langstream = Arrays.stream(langs);

        //Collection.stream()
        List<String> langList = new ArrayList<>();
        langList = Arrays.asList("python", "java", "javascript", "c", "c++", "c#");
        //System.out.println(langList.size());
        Stream<String> langListStream = langList.stream();

        //Stream.of()
        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++", "c#");

        //스트림 사용
        //중간 연산(Intermediate Operation) : 정수끼리 여러개의 필터(중간에 여러 작업) - filter, map, sorted, distinct, skip, ...
        //최종 연산(Terminal Operation) : 위와 같은 작업을 통해 나오는 최종 결과(얘는 한 개만 존재 가능) - count, min, max, sum, forEach, anyMatch, allMatch

        //90점 이상인 점수만 성적
        Arrays.stream(scores).filter(x->x>=90).forEach(x -> System.out.println(x));
        //Arrays.stream(scores).filter(x->x>=90).forEach(System.out::println);
        System.out.println("----------------------------");

        //90점 이상인 사람의 수
        int count = (int)Arrays.stream(scores).filter(x->x>=90).count(); //long 형태라서 int로 형변환
        System.out.println(count);
        System.out.println("----------------------------");

        //90점 이상인 점수들의 합
        int sum = Arrays.stream(scores).filter(x->x>=90).sum();
        System.out.println(sum);
        System.out.println("----------------------------");

        //90점 이상인 점수들을 정렬
        Arrays.stream(scores).filter(x->x>=90).sorted().forEach(System.out::println);
        System.out.println("----------------------------");
    }
}
