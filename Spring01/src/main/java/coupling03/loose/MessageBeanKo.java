package coupling03.loose;

public class MessageBeanKo implements MessageBean {
    @Override
    public void hello(String name) {
        IO.println("안녕하세요, " + name + "님!!!");
    }
}
