package main.java.coupling01.strong;

public class CouplingMain {
    void main() {
        MessageBean bean = new MessageBean();
        bean.hello("jaebeom");
        /*
        강결합 (String Coupling)
        - 결합도가 높다 : MessageBean 클래스가 변경되면, CouplingMain 클래슫고 반드시 수정되어야 함
        - 새로운 기능 추가  시, 키존 코드 수정 필요
         */
    }
}
