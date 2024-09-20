package ass1b3;

abstract public class Staff {
    String name;
    String address;

    public Staff(String name,String address){
        this.name = name;
        this.address = address;
    }

    abstract void calculateSalary();
}

