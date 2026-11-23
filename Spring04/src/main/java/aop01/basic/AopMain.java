package aop01.basic;

public class AopMain {
    void main() {
        Engineer e = new Engineer();
        e.daily();
        IO.println("-----");
        Developer d = new Developer();
        d.daily();
    }
}
