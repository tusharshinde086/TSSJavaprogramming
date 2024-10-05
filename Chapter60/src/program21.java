
public class program21 {
    public static void main(String[] args){
        Main5 obj1 = new Main5("rani",20);
        Main5 obj2 = new Main5(obj1);
        obj1.display();
        System.out.println();
        obj2.display();
    }    
}

class Main5{
    int age;
    String name;

    Main5(String name, int age){
        this.name = name;
        this.age = age;
    }

    Main5(Main5 s){
        this.name = s.name;
        this.age = s.age;
    }

    void display(){
        System.out.print("name: "+name+"\t"+"age: "+age);
    }
}

