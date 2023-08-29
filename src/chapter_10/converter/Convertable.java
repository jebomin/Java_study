package chapter_10.converter;

//04 파일에서 작성한 람다식은 convert 메소드와 연결
//만약 추상메소드가 conver 말고 하나 더 있다면 어떤 메소드와 연결되는지 모름
@FunctionalInterface //그래서 함수형 인터페이스로 쓴다는 것을 표시
public interface Convertable {
    void convert(int USD);
    // void convert2(); -> 이렇게 하나 더 정의하면 에러가 발생했다는 것을 보여줌
}
