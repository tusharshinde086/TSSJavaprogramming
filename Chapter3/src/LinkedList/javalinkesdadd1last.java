package LinkedList;

import java.util.LinkedList;

public class javalinkesdadd1last {
    public static void main(String[] args){
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("ajay");
        obj.add("pandu");
        System.out.println(obj);
        obj.add("pravin");
        System.out.println(obj);
        obj.addFirst("Vishal");
        System.out.println(obj);
        obj.add("Raju");
        System.out.println(obj);
        obj.addLast("Sangram");
        System.out.println(obj);
        obj.add(3,"Sudarshan");
        System.out.println(obj);

    }
}
