import java.util.LinkedList;
import java.util.ListIterator;

public class ass1ColorList {

        public static void main(String[] args) {
            LinkedList<String> colours = new LinkedList<>();
            colours.add("red");
            colours.add("blue");
            colours.add("yellow");
            colours.add("orange");

            System.out.println("Contents of the list:");
            for (String colour : colours) {
                System.out.println(colour);
            }

            System.out.println("\nContents in reverse order:");
            ListIterator<String> iterator = colours.listIterator(colours.size());
            while (iterator.hasPrevious()) {
                System.out.println(iterator.previous());
            }

            LinkedList<String> newColours = new LinkedList<>();
            newColours.add("pink");
            newColours.add("green");

            colours.addAll(2, newColours);

            System.out.println("\nContents of the updated list:");
            for (String colour : colours) {
                System.out.println(colour);
            }
        }
    }


