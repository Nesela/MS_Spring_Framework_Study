package design01.creational.singleton;

public class Singleton01 {

    // 객체를 외부에서 사용하기 위한 변수
    private static Singleton01 instance;

    // 생성자 private = new 연산자 사용 X
    private Singleton01() {
        IO.println("객체 생성됨!");
    }

    // 객체 생성 or 이미 만들어진 객체를 리턴
    public static Singleton01 getInstance() {
        // 개체가 없으면 생성
        if (instance == null) {
            instance = new Singleton01();
        } else {
            IO.println("객체 리턴됨!");
        }

        return  instance;
    }

    public static void prn() {
        IO.println(instance);
        IO.println("singleton : 객체를 단 한번만 생성!");
    }
}
