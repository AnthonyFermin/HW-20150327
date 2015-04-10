package nyc.c4q.AnthonyFermin;

import java.util.Scanner;

/**Anthony Fermin
 * Access Code HW3 - Java Classes
 * Methods for checking same city of to Person objects and creating new child Person object based on parent object
 */
public class JavaClasses {

    // testing methods within this main
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        Person tom = new Person("Tom");
        Person timmy = new Person("Timmy");
        Person wanda = new Person("Wanda");
        wanda.setPhoneNumber("(347)555-5123");


        tom.setCity("New York City");
        timmy.setCity("Stockholm");
        wanda.setCity("New York City");

        System.out.println(tom.getName() + "'s City: " + tom.getCity());
        System.out.println(timmy.getName() + "'s City: " + timmy.getCity());
        System.out.println(wanda.getName() + "'s City: " + wanda.getCity());
        System.out.println();

        // testing checkSameCity method
        System.out.println("Does " + tom.getName() + " live in the same city as " + timmy.getName() + ": " + checkSameCity(tom,timmy));
        System.out.println("Does " + tom.getName() + " live in the same city as " + wanda.getName() + ": " + checkSameCity(tom,wanda));

        System.out.println();
        System.out.println(wanda.getName() + "'s Info: ");
        System.out.println("City: " + wanda.getCity());
        System.out.println("Phone Number: " + wanda.getPhoneNumber());

        // testing registerChild method
        Person wandaChild = registerChild(wanda);
        System.out.println();
        System.out.print(wanda.getName() + " just gave birth to her newborn daughter. What will she name her daughter: ");
        wandaChild.setName(in.nextLine());

        System.out.println();
        System.out.println(wandaChild.getName() + "'s Info: ");
        System.out.println("City: " + wandaChild.getCity());
        System.out.println("Phone Number: " + wandaChild.getPhoneNumber());

        System.out.println();
        System.out.println("Thank you! Have a nice day!");

    }

    // method returns true if the cities of the two Person instances match, otherwise returns false
    public static boolean checkSameCity(Person p1, Person p2){

        return p1.getCity().equalsIgnoreCase(p2.getCity());

    }

    // method returns new Person instance for a child with default name of "Abc" and with same city and phone number as parent
    public static Person registerChild(Person parent){
        Person child = new Person("Abc");
        child.setCity(parent.getCity());
        child.setPhoneNumber(parent.getPhoneNumber());

        return child;
    }
}
