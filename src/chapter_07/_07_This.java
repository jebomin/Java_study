package chapter_07;

public class _07_This {
    public static void main(String[] args) {
        Blackbox b1 = new Blackbox();
        b1.modelName = "까망이"; //까망이(최신형)
        b1.appendModelName("(최신형)");
        System.out.println(b1.modelName);
    }
}
