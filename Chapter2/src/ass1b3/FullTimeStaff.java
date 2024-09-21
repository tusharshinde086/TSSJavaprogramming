package ass1b3;

class FullTimeStaff extends Staff {
    String department;
    double salary, hra, da;

    FullTimeStaff(String name, String address, String department, double salary) {
        super(name, address);
        this.department = department;
        this.salary = salary;
        this.hra = 0.08 * salary;
        this.da = 0.05 * salary;
    }

    @Override
    double calculateSalary() {
        return salary + hra + da;
    }

    @Override
    public String toString() {
        return "FullTimeStaff [name=" + name + ", address=" + address + ", department=" + department +
                ", salary=" + calculateSalary() + "]";
    }
}
