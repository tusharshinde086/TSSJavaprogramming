package LinkedList;

import java.util.LinkedList;

public class javaaddsetlinked {
    public static void main(String[] args){
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("ajay");
        obj.add("pandu");
        System.out.println(obj);
        obj.add(1,"pravin");
        System.out.println(obj);
        obj.addFirst("Vishal");
        System.out.println(obj);
        obj.add("Raju");
        System.out.println(obj);
        obj.set(2,"Savita");
        System.out.println(obj);
    }
}
