package ArrayList1;

import java.util.ArrayList;

public class ArrayListcollection {

        public static void main(String[] args){
            ArrayList<String> name = new ArrayList<String>();
            name.add("Aniket");
            name.add("Ankush");
            name.add("Altaf");
            System.out.println(name);
            name.add("Anishh");
            System.out.println(name);
            name.add(1, "Ajay");
            System.out.println(name);
            name.add(0,"Pandu");
            System.out.println(name);
        }
    }


