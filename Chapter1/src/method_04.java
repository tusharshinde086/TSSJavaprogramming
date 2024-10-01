public class program_method_03 {
    public static void main(String args[]){
        Main obj1 = new Main();
        obj1.StudentInfo("PRAVIN JUNNE", 4212);
    }
    
}

class Main{

    void StudentInfo(String name, int rollNo){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
    }
}
