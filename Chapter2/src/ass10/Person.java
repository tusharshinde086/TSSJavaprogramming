package ass10;
import utility.CapitalString;

public class Person {
    private String name;
    private String city;

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void display() {
        CapitalString capitalString = new CapitalString();
        String capitalizedName = capitalString.capitalizeFirstLetter(name);
        System.out.println("Person Name: " + capitalizedName);
        System.out.println("City: " + city);
    }

    public static void main(String[] args) {
        Person person = new Person("john", "New York");
        person.display();
    }
}

