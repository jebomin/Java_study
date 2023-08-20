package chapter_07;

public class Blackbox {
    String modelName; //모델명
    String resolution; //해상도
    int price; //가격
    String color; //색상
    int serialNumber; //시리얼 번호

    static int counter = 0; //시리얼 번호를 생성해주는 역할 (처음에는 0이었다가 ++ 연산을 통해석 값을 증가시킴)


    static boolean canAutoReport = false; //자동신고기능(아직은 개발 안된 상태)

    Blackbox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급 받았습니다 : "+this.serialNumber);
    }

    Blackbox(String modelName, String resolution, int price, String color) {
//        this(); //기본 생성자 동작을 하고 아래쪽 동작을 수행(기본 생성자 호출)
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }

    void autoReport() {
        if(canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if(type == 1) { //일반영상
            return 9;
        } else if (type == 2) { //이벤트 영상
            return 1;
        }
        return 10;
    }

    //showDataTime : 날짜 정보 표시 여부
    //showSpeed : 속도 정보 표시 여부
    //min : 영상 기록 단위(분)
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜 정보가 표시 됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도 정보가 표시 됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record() {
        record(true, true, 5);
    }

    static void callServiceCenter() {
        System.out.println("서비스 센터(1588-0000)로 연결합니다.");
        //modelName = "test"; -> 안됨
        //canAutoReport = false; -> 됨
        //staic으로 선언한 클래스 변수는 static 메소드 안에서 사용 가능
        //modelName과 같은 인스턴스 변수는 객체가 만들어져야 생기는 변수이기 때문에 static 안에서 직접 접근이 불가
        //메소드 내에서 인스턴스 변수의 사용이 필요 없는 경우에 공통적으로 적용되는 기능(클래스 메소드)를 사용할 수 있음
        //일반적으로 만드는 메소드는 인스턴스 메소드 -> 각 객체마다 다른 동작
        //static 키워드가 붙은 건 클래스 메소드 -> 객체가 만들어지지 않아도 '클래스이름.어쩌고'로 접근 가능
    }

    void appendModelName(String modelName) { //String s -> 이러면 안 붙여도됨!
        this.modelName += modelName; //인스턴스 변수와 전달받은 파라미터 변수의 이름이 같으면 this를 붙여야함
        //modelName += s; -> 이러면 안 붙여도됨!
    }

    //Getter&Setter
    //Getter : 값을 가지고 오는 메소드
    String getModelName() {
        return modelName;
    }

    //Setter : 값을 설정하는 메소드
    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if(price<100000) {
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}
