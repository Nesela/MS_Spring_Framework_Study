package di05.autowire;

public class Address {
    private Person person;
    private String address;

    public Address() {

    }

    public Address(Person person, String address) {
        this.person = person;
        this.address =address;
    }

    public Person getPerson(){
        return person;
    }

    public void setPerson(Person person){
        this.person =person;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address =address;
    }

    @Override
    public String toString() {
        return person.toString() + "\t 주소 : " + address;
    }
}
