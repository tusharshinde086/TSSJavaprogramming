public class program_method_05 {
    public static void main(String args[]){
        Main obj1 = new Main();
        obj1.setData("Tushar",  "Pure Single");
        obj1.getData();
    }
}

class Main{
    private String name;
    private String status;

    public void getData(){
        System.out.println("Name:"+name);
        System.out.println("Status: "+status);
    }

    public void setData(String name, String status){
        this.name = name;
        this.status = status;
    }
}