package ass1b3;

class PartTimeStaff extends Staff {
    int number_of_hours;
    double rate_per_hours;

    PartTimeStaff(String name, String address, int number_of_hours, double rate_per_hours) {
        super(name, address);
        this.number_of_hours = number_of_hours;
        this.rate_per_hours = rate_per_hours;
    }

    @Override
    double calculateSalary() {
        return number_of_hours * rate_per_hours;
    }

    @Override
    public String toString() {
        return "PartTimeStaff [name=" + name + ", address=" + address +
                ", salary=" + calculateSalary() + "]";
    }
}
