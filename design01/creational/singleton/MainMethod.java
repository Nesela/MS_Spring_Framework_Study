package design01.creational.singleton;

public class MainMethod {
    void main() {
//        Singleton01 s = new Singleton01()

        // Lazy initialization
        Singleton01 s01 = Singleton01.getInstance();
        s01.prn();

        Singleton01 s02 = Singleton01.getInstance();
        s02.prn();

        IO.println((s01 == s02));

        // Eager initialization
        Singleton02 s03 = Singleton02.getInstance();
        s03.prn();
        Singleton02 s04 = Singleton02.getInstance();
        s04.prn();
        IO.println(s03 == s04);
    }
}
