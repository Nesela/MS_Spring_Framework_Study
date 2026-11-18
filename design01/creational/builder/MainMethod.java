package design01.creational.builder;

public class MainMethod {
    void main() {
        User01 hong = new User01("hong-gd", 100, null, null);
        IO.println((hong));

        User02 kim = new User02.Builder()
                .name("kim-sd")
                .age(100)
                .address("seoul")
                .phone("010-1111-1111")
                .build();
        IO.println(kim);
    }
}
