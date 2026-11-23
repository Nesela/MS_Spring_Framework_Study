package aop01.basic;

public class Developer {
    public void daily() {
        IO.println("출근한다");

        try {
            IO.println("개발한다");
        } catch (Exception e) {
            IO.println("주말이었따..");
        } finally {
            IO.println("퇴근한다!");
        }
    }
}
