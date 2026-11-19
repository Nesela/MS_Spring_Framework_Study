package main.java.coupling02.loose;

public class CouplingMain {
    void main() {
        MessageBean korean = new MessageBeanKo();
        korean.hello("재범");

        MessageBean english = new MessageBeanEn();
        english.hello("jaebeom");
    }
}
