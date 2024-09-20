package ass1b3;

public class FullTimeStaff extends Staff{
    String department;
    Double salary;
    Double hra = 0.08* salary;
    Double da = (Double) (0.05 * salary);

    public FullTimeStaff(String name,String address,String department,Double salary){
        super(name,address);
        this.department = department ;
        this.salary = salary ;
    }

    double calculatSalary(){
        return salary +hra +da;
    }

    public String toString() {
        return "FullTimeStaff [Name:" + name +
                ", Address: "+ address +
                ", Department: " + department +
                ", Salary " +  calculatSalary() + "]" ;
    }

    @Override
    void calculateSalary() {

    }
}
