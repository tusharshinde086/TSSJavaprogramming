

public class method2 {
        public static void main(String args[]){
            Main6 obj1 = new Main6();
            obj1.setData("rani",  "students");
            obj1.getData();
        }
    }

    class Main6{
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

