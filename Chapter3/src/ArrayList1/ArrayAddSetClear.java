package ArrayList1;
import java.util.ArrayList;
public class ArrayAddSetClear {

        public static void main(String[] args){
            ArrayList<String> name = new ArrayList<String>();
            name.add("Aniket");
            name.add("Ankush");
            name.add("Altaf");
            System.out.println(name);
            name.add("Anishh");
            System.out.println(name);
            name.set(2, "Vishal");
            System.out.println(name);
            name.set(0,"Pravin");
            System.out.println(name);
            name.clear();
            System.out.println(name);
        }
    }




