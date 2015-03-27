package nyc.c4q.AnthonyFermin;

/**
 * Created by c4q-anthonyf on 3/26/15.
 */
public class JavaClasses {

    public static void main(String[] args){
        Person tom = new Person("Tom");
        Person timmy = new Person("Timmy");
        Person william = new Person("William");

        tom.setCity("New York City");
        timmy.setCity("Stockholm");
        william.setCity("New York City");

        System.out.println("Does " + tom.getName() + " live in the same city as " + timmy.getName() + ": " + checkSameCity(tom,timmy));

    }
    public static boolean checkSameCity(Person p1, Person p2){

        return p1.getCity().equalsIgnoreCase(p2.getCity());

    }
}
