package nyc.c4q.AnthonyFermin;

/**
 * Person Class for HW3
 */
public class Person {

    private String name;
    private String phoneNumber;
    private String city;

    public Person(){
    }

    public Person(String name){
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args)
    {
        Person tom = new Person();
        Person john = new Person("John");

        tom.setName("Tom");
        System.out.println("His name is " + tom.getName() + ".");

        john.setCity("Salt Lake City");
        john.setPhoneNumber("212-555-1234");

        System.out.println( john.getName() + "'s City is: " + john.getCity());
        System.out.println( john.getName() + "'s Phone Number is: " + john.getPhoneNumber());
    }

}