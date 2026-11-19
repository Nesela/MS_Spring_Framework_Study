package design01.creational.prototype;

public class MainMethod {
    void main() {
        Character c01 = new Character("전사", 100, 50, 30, 1);
        IO.println(c01);

        Character c02 = c01.copy();
        c02.setJob("궁수");
        c02.setHp(90);
        c02.setAttack(60);
        IO.println(c02);

        Character c03 = c01.copy();
        c03.setJob("마법사");
        c03.setHp(90);
        c03.setAttack(70);
        c03.setDefense(20);
        IO.println(c03);

    }
}
