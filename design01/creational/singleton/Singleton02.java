package design01.creational.singleton;

public class Singleton02 {
    // threadsafe 방식

    private static final Singleton02 INSTANCE = new Singleton02();

    private  Singleton02() {
        IO.println("객체 생성됨!");
    }

    public static Singleton02 getInstance() {
        return INSTANCE;
    }

    public static void prn() {
        IO.println(INSTANCE);
        IO.println("singleton!!");
    }
}
