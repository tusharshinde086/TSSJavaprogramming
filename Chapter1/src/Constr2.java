public class Constr2 {
    int id;
    String name;

    // Constructor to initialize id and name
    public Constr2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display id and name
    public void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        // Creating objects with id and name
        Constr2 s1 = new Constr2(1, "Alice");
        Constr2 s2 = new Constr2(2, "Bob");

        // Displaying the objects' data
        s1.display();
        s2.display();
    }
}
