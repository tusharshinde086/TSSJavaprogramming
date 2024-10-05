
public class program20 {
    public static void main(String[] args){
        Main4 obj1 = new Main4("rani", 4212,20);
        Main4 obj2 = new Main4("sakshi",4213);
    
        obj1.display();
        obj2.display();
    }
    }
    
    class Main4{
        int rollNo;
        String name;
        int age;
    
        Main4(String name, int rollNo){
            this.name = name;
            this.rollNo = rollNo;
        }
    
        Main4(String name, int rollNo, int age){
            this.name = name;
            this.rollNo = rollNo;
            this.age = age;  
        }
    
        void display(){
            System.out.print("Name: "+name+"\n"+"Roll No: "+rollNo+"Age: "+age);
        }
    }
    
