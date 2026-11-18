package design01.creational.builder;

public class User02 {
    private final String name;
    private final int age;
    private final String phone;
    private final String address;

    private User02(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return String.format("%s : %d \t %s \t %s", name, age, phone, address);
    }

    public static class Builder {
        private String name;
        private int age;
        private String phone;
        private String address;

        public Builder name(String name) {
            this.name = name;
            // method chaining
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User02 build() {
            return new User02(this);
        }
    }
}
