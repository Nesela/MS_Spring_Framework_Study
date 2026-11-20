package di05.autowire;

public class Person {
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name,int age) {
        this.name =name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("이름 : %s \t 나이 : %d",name, age);
    }
}
