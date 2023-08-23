package chapter_08.detector;

public interface Detectable {
    //인터페이스에서 만드는 메소드 앞에는 무조건 public abstract가 자동으로 들어감
    public abstract void detect(); //감지

    //인터페이스에서 선언하는 변수 앞에는 public static final이 자동으로 들어감
    public static final String name = "감시자";
}
