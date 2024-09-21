package ass2b2;

public class Programmer extends Developer{
    String proglanguage;
    public Programmer(String proglanguage , String projectName){
        this.proglanguage= proglanguage;
        this.projectname = projectName;
    }

    void display(){
        System.out.println("Programing language is : "+ proglanguage);
        System.out.println("project name: "+ projectname );
    }
}
