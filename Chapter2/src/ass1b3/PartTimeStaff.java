package ass1b3;

public class PartTimeStaff extends Staff{
    int number_of_hours;
    Double rate_per_hours;

  PartTimeStaff(int number_of_hours, Double rate_per_hours, String name,String address){
      super(name, address);
      this.number_of_hours = number_of_hours;
      this.rate_per_hours = rate_per_hours;
  }
  public PartTimeStaff(){
      
  }
}
