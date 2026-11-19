package main.java.coupling02.loose;

public class MessageBeanEn implements  MessageBean{

    @Override
    public void hello(String name) {
        IO.println("Hello " + name + "님!!!");
    }
}
