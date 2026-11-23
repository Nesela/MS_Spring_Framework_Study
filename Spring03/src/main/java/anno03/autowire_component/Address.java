package anno03.autowire_component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Autowired
    private Person person;
    private String addr;

    public Address() {
        addr = "서울";
    }

    public Address(Person person, String addr){
        this.person =person;
        this.addr =addr;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return person + " \t " + addr;
    }
}
