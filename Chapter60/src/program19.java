
public class program19 {
    public static void main(String args[]){
        Main2 obj1 = new Main2("java");
        Main2 obj2 = new Main2("c++");
        Main2 obj3 = new Main2("Python");
        Main2 obj4 = new Main2("javascript");
    }
}

class Main2{
    String language;
    Main2(String lan){
        language = lan;
        System.out.println(language+" programming language");
    }
}

